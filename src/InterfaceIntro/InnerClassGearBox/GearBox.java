package InterfaceIntro.InnerClassGearBox;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
//        for(int i = 0; i< maxGears; i++){
//            this.gears.add(new Gear(i, i *8));
//        }

    }

    public ArrayList<Gear> getGears() {
        return gears;
    }

    public void addGear(int number, double ratio){
        this.gears.add(new Gear(number, ratio));
    }

    public void changeGears(int newGear){
        this.currentGear = newGear;
    }

    public int getWheelSpeed(int revs){
        int currentSpeed = (int) (revs * gears.get(this.currentGear).getRatio());
        return currentSpeed;
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        } 

        public double driveSpeed(int revs){
            return revs *(this.ratio);
        }

        public double getRatio() {
            return ratio;
        }
    }
}
