package String.StringBuffer;

public class Test {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Saikumar");
        System.out.println(name);

        //1.append Method
        name = name.append(" Laveti");
        System.out.println(name); //Saikumar Laveti

        //2.insert Method
        name = name.insert(3,"hello");
        System.out.println(name); //Saihellokumar Laveti

    }
}
