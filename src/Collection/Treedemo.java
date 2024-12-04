package Collection;

import java.util.Map;
import java.util.TreeMap;

public class Treedemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> names = new TreeMap<Integer,String>();
        names.put(1,"Saikumar");
        names.put(2,"Santosh");
        names.put(3,"Lokesh");

        for(Map.Entry ma:names.entrySet()) {
            System.out.println(ma.getKey() + " " + ma.getValue());
        }
        names.remove(3);
        for(Map.Entry m:names.entrySet()){
            System.out.println(m.getKey() + " "+ m.getValue());
        }
    }
}
