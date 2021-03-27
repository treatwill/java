package java_1.dataTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysBlank {
    int[] nums = new int[]{10,23,3,4,5,2,1};
    String[] greetings = new String[]{"Hello","Howdy","Hallo","Hola","Bonjour","Ciao","أهلا و سهلا"};
    int[] bits = new int[]{0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
    String[] thingsWithColorsInTheName = new String[]{"bluebird","yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","Matterhorn","Great White Lakes","torah","white bible","green quran", "red herring", "Black Sea"};



    public void printNums() {
//        print all the numbers in the nums array to the console.  The nums array is defined on this class.

        for (int num : nums) {
            System.out.println(num);
        }

    };

    public void greet(String name) {
//        Randomly greet the person with a random greeting found in the greetings array.
//        For every greeting in the greetings array, Greet the person with every greeting in the greetings array declared in this class.
/*        ex : craig => greet() => "Hello Craig"
               "ABRAM" => greet() => "Hola Abram"
               "maTT => greet() => "أهلا و سهلا Matt"
 */
    double greeting = greetings.length * Math.random();
    System.out.println(greetings[(int) greeting] + " " + name + "!");

    }

   public boolean[] bitsToBinaries() {
//        convert the bit array of 1's and 0's into a binary array of true and false. return the 'converted' array
//        ex : bitsToBinaries() => [false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false]

 boolean[] boolValue = new boolean[bits.length];

 for(int i = 0; i < bits.length; i++){
     boolValue[i] = bits[i] == 0;
 }
        System.out.println(Arrays.toString(boolValue));
       return boolValue;
    };

    public List<String> keepColors() {
//        In this class is an array called "thingsWithColorsInTheName".  Remove the elements that do NOT have a color associated with it.  Return the filtered color array of elements that have a color associated with it.
//        ex : keepColors() => ["bluebird","yellow bumblebee","black spider", "green monkey","pink","black bird","Great White Lakes","white bible","green quran", "red herring", "Black Sea"]

        List<String> listOfColors = new ArrayList<String>(Arrays.asList("green", "pink", "white", "black", "blue", "red"));


               List<String> colorFilter = java.util.Arrays.stream(thingsWithColorsInTheName).filter(thing -> listOfColors.stream().anyMatch(color -> thing.toLowerCase().contains(color))).collect(Collectors.toList());



        System.out.println(colorFilter);



       return colorFilter;
    }

    public static void main(String[] args) {
        new ArraysBlank().printNums();
        new ArraysBlank().greet("Matt");
        new ArraysBlank().bitsToBinaries();
        new ArraysBlank().keepColors();
    }

}







