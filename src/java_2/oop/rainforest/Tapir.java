package java_2.oop.rainforest;

public class Tapir extends RainforestCreature{
    String temper;

    public Tapir(String dietType, String temper) {
        super(dietType);
        this.temper = temper;
    }

    public String getTemper() {
        return temper;
    }

    public void setTemper(String temper) {
        this.temper = temper;
    }

    public void looks(){
        System.out.println("The Tapir is a pretty ugly animal in my opinion.");
    }

    @Override
    public String toString() {
        return "Tapir{" +
                "dietType='" + dietType + '\'' +
                ", temper='" + temper + '\'' +
                '}';
    }
}
