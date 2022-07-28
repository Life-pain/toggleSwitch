public class Main {
    public static void main(String[] args) {
        UserAndToy userAndToy = new UserAndToy();

        new Thread(null, userAndToy::user, "Пользователь").start();
        new Thread(null, userAndToy::toy, "Игрушка").start();
    }
}
