package Collection;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        //add
        System.out.println(number);

        //get
        System.out.println(number.get(2));

        //delete
        number.remove(2);
        System.out.println(number);

        //set -->add element spefic index
        number.set(2,10);

        //contains
        System.out.println(number.contains(2));
        System.out.println(number.contains(5));

    }
}
