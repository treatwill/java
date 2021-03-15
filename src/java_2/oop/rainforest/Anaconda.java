package java_2.oop.rainforest;

public class Anaconda extends RainforestCreature{
    boolean isReptile;

    public Anaconda(String dietType, boolean isReptile) {
        super(dietType);
        this.isReptile = isReptile;
    }

    public boolean isReptile() {
        return isReptile;
    }

    public void setReptile(boolean reptile) {
        isReptile = reptile;
    }

    public void movement() {
        System.out.println("The Anaconda is a type of snake so its slithers.");
    }

    @Override
    public String toString() {
        return "Anaconda{" +
                "isReptile=" + isReptile +
                ", dietType='" + dietType + '\'' +
                '}';
    }
}
