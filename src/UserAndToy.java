public class UserAndToy {
    private final int COUNT_SWITCH = 3;
    private final int USER_SLEEP = 3000;

    final ToggleSwitch toggleSwitch = new ToggleSwitch();
    boolean isAliveToy = true;
    private int counter = 0;

    public void user() {
        try {
            Thread.sleep(USER_SLEEP);
            if (!toggleSwitch.getStatusToggler()) {
                toggleSwitch.switchOn();
                System.out.println("Тумблер включен");
                counter++;
            } else user();

            while (counter < COUNT_SWITCH) user();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void toy() {
        while (isAliveToy) {
            if (toggleSwitch.getStatusToggler()) {
                toggleSwitch.switchOff();
                System.out.println("Тумблер выключен");
            }
            if (counter >= COUNT_SWITCH) {
                killToy();
                System.out.println("Программа завершена");
            }
        }
    }

    public void killToy(){
        isAliveToy = false;
    }
}
