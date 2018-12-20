package InterfaceIntro;

public class Mobile implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public Mobile(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println(phoneNumber + " is calling");
        } else{
            System.out.println("phone is off");
        }
    }

    @Override
    public void answer() {

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}