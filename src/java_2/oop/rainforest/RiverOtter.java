package java_2.oop.rainforest;

public class RiverOtter extends RainforestCreature{
    boolean swim;

    public RiverOtter(String dietType, boolean swim) {
        super(dietType);
        this.swim = swim;
    }

    public boolean getSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public void lives(){
        System.out.println("The Otters usually live in packs for protection.");
    }


    @Override
    public String toString() {
        return "RiverOtter{" +
                "dietType='" + dietType + '\'' +
                ", swim='" + swim + '\'' +
                '}';
    }
}
