package java_2.oop.rainforest;

public class RainforestCreature extends Creature {
	//your code here


    public RainforestCreature(String dietType) {
        super(dietType);
    }


    @Override
    public String toString() {
        return "RainforestCreature{" +
                "dietType='" + dietType + '\'' +
                '}';
    }
}


//abstraction