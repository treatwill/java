package java_2.oop.rainforest;

public class Jaguar extends RainforestCreature{
    boolean hunts;

    public Jaguar(String dietType, boolean hunts) {
        super(dietType);
        this.hunts = hunts;
    }

    public boolean isHunts() {
        return hunts;
    }

    public void setHunts(boolean hunts) {
        this.hunts = hunts;
    }

    public void species(){
        System.out.println("The Jaguar is a species of big cat.");
    }

    @Override
    public String toString() {
        return "Jaguar{" +
                "dietType='" + dietType + '\'' +
                ", hunts=" + hunts +
                '}';
    }
}
