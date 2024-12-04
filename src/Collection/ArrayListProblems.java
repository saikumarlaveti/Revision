package Collection;

import java.util.ArrayList;

public class ArrayListProblems {
    public void swap(ArrayList<Integer> list ,int index1,int index2){
        int temp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        for(int i =list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
        // Multi demionsal arrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);

        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        main.add(list1);
        main.add(list2);
        main.add(list3);
        System.out.println("Multidemiosal arraylist");
        System.out.println(main);
        for(int i =0;i<main.size();i++){
            ArrayList<Integer> currList = main.get(i);
            for(int j = 0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }


        System.out.println("swap ");
        ArrayListProblems ap = new ArrayListProblems();
        ap.swap(list,2,3);
    }
}
