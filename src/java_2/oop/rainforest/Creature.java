package java_2.oop.rainforest;

public abstract class Creature {
//	Define 1 common characteristic that any Creature may generally possess
//	Define 1 common action that any Creature may generally perform
    String dietType;

    public Creature(String dietType) {
        this.dietType = dietType;
    }

    public void sleep() {
        System.out.println("The animal is enjoying its sleep.");
    }

    @Override
    public String toString() {
        return "Creature{" +
                "dietType='" + dietType + '\'' +
                '}';
    }
}
