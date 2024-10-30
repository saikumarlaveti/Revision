package String.StringBuffer;

public class Methods {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Saikumar");
        System.out.println(name);

        //1.append Method
        name = name.append(" Laveti");
        System.out.println(name); //Saikumar Laveti

        //2.insert Method
        name = name.insert(3,"hello");
        System.out.println(name); //Saihellokumar Laveti

        //3.replace Method
        StringBuffer name1 =new StringBuffer( "Sanju");
        name1 = name1.replace(1,3,"@@@");
        System.out.println(name1);  //S@@@ju

        //4.delete Method
        name1 = name1.delete(0,2);
        System.out.println(name1); //@@ju

        //5.reverse Method
        StringBuffer sb = new StringBuffer("saikumar");
        System.out.println(sb.reverse()); //ramukias

        //6.capacity
        System.out.println(sb.capacity()); //24

        //7.ensureCapacity

    }
}
