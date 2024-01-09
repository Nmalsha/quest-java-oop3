public class Eagle extends Bird  implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

      @Override
    public void takeOff() {
        if (!flying) {
            System.out.println(getName() + " takes off in the sky.");
            flying = true;
        } else {
            System.out.println(getName() + " is already flying.");
        }
    }

    @Override
    public void ascend(int altitude) {
        if (flying) {
            this.altitude += altitude;
            System.out.println(getName() + " flies upward, altitude: " + this.altitude);
        } else {
            System.out.println(getName() + " can't ascend, it's not flying.");
        }
    }

    @Override
    public void glide() {
        if (flying) {
            System.out.println(getName() + " glides into the air.");
        } else {
            System.out.println(getName() + " can't glide, it's not flying.");
        }
    }

    @Override
    public void descend(int altitude) {
        if (flying) {
            this.altitude -= altitude;
            if (this.altitude <= 0) {
                System.out.println(getName() + " lands on the ground.");
                flying = false;
                this.altitude = 0;
            } else {
                System.out.println(getName() + " flies downward, altitude: " + this.altitude);
            }
        } else {
            System.out.println(getName() + " can't descend, it's not flying.");
        }
    }

    @Override
    public void land() {
        if (flying) {
            System.out.println(getName() + " lands on the ground.");
            flying = false;
            altitude = 0;
        } else {
            System.out.println(getName() + " is already on the ground.");
        }
    }
}