public class ToggleSwitch {
    private volatile boolean toggler = false;

    public void switchOn(){
        toggler = true;
    }
    public void switchOff(){
        toggler = false;
    }
    public boolean getStatusToggler(){
        return toggler;
    }
}
