import Array.SimpleArray.Array;

import java.util.*;
class  myComprator implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {
//        if(o1>o2){
//            return 1;
//        }
//        else if(o1<o2){
//            return -1;
//        }
//        else{
//            return 0;
//        }
        return (o1>o2) ? 1 :(o1<o2)?-1:0;
    }
}

public class Sorting {

    public static void main(String[] args) {
        ArrayList<Integer> al  = new ArrayList<>();
        al.add(55);
        al.add(28);
        al.add(78);
        al.add(2);
        al.add(3);
        System.out.println(al);
//        Collections.sort(al);
//        System.out.println(al); default methods
//        Collections.sort(al,new myComprator());
//        System.out.println(al);
    Comparator<Integer> c = (o1,o2) -> (o1>o2) ? 1 :(o1<o2)?-1:0;
    Collections.sort(al,c);
        System.out.println(al);

    }
}
