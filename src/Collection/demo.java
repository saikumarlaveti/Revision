package Collection;

import java.util.Map;
import java.util.LinkedHashMap;

public class demo{
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(40,"Saikumar");
        lhm.put(29,"lokesh");
        lhm.put(56,"Pradeep");

        for(Map.Entry m:lhm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
            System.out.print("Keys "+ lhm.keySet());
            System.out.println("Values " + lhm.values());
            System.out.println(lhm.entrySet());
            lhm.remove(40);
        System.out.println(lhm.entrySet());
        }
    }


