package java_2.oop.monkey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MonkeyCage {

    private List<Monkey> monkeys;

    boolean[] areMonkeysSmiling(Monkey[] monkeys) {
    //We have an array of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.  Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are not smiling, return false.  If it is a tie, return true.
        boolean[] isSmiling = new boolean[monkeys.length];


        for (int i = 0; i < monkeys.length; i++) {
            isSmiling[i] = false;
        }
        System.out.println(Arrays.toString(isSmiling));
        return isSmiling;
    }

    ArrayList<Monkey> addMonkey(Monkey monkey) {
//        add a new monkey to the MonkeyCage

        ArrayList<Monkey> addMonkeys = new ArrayList<>(Collections.emptyList());

        addMonkeys.add(monkey);

        return addMonkeys;
    }

    void removeMonkey(Monkey monkey) {
//        remove a monkey from the MonkeyCage
        boolean removeMonkeys = monkeys.remove(monkey);
        System.out.println(monkey);
    }

    static class Monkey { //inner class.  DO NOT MOVE THIS CLASS
        String name;
        boolean smiling;

        public Monkey(String name, boolean smiling) {
            this.name = name;
            this.smiling = smiling;
        }
    }
}