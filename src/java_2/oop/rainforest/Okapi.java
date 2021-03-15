package java_2.oop.rainforest;

public class Okapi extends RainforestCreature{
    boolean stripes;

    public Okapi(String dietType, boolean stripes) {
        super(dietType);
        this.stripes = stripes;
    }

    public boolean isStripes() {
        return stripes;
    }

    public void setStripes(boolean stripes) {
        this.stripes = stripes;
    }

    public void graze() {
        System.out.println("The Okapi is grazing");
    }

    @Override
    public String toString() {
        return "Okapi{" +
                "dietType='" + dietType + '\'' +
                ", stripes=" + stripes +
                '}';
    }
}
