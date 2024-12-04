package Collection;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo {
    public static void main(String[] args) {
        HashMap<Integer,String> details= new HashMap<Integer,String>();
        details.put(1,"Saikumar");
        details.put(2,"Santosh");
        details.put(3,"Rajeswari");
        details.put(4,"Appala Naidu");

      for(Map.Entry  m:details.entrySet()){
          System.out.println(m.getKey() + " " + m.getValue());
      }

    }
}
