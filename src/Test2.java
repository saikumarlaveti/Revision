import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Test2{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(9);
        //System.out.println(list);
        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(3));
        System.out.println(p.test(2));
        Consumer<ArrayList<Integer>> print  = i-> System.out.println(i);
        print.accept(list);
        Function<Integer,Integer> even1 = i->i*i;
        System.out.println(even1.apply(2));

        List<Integer> even = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> add = list.stream().map(i->i+3).filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(add);


    }
}