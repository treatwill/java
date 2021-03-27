package java_2.oop.rainforest;

public class Sloth extends RainforestCreature{

    String speed;

    public Sloth(String dietType, String speed) {
        super(dietType);
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void sleepSpace() {
        System.out.println("The Sloth generally sleeps in trees for safety.");
    }

    @Override
    public String toString() {
        return "Sloth{" +
                "dietType='" + dietType + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
