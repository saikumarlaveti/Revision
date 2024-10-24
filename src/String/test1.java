package String;

public class test1 {
    public static void main(String[] args) {
        String name  = new String( "Saikumar");
        String name1 = new String( "Saikumar");
        System.out.println(name == name1);// compare values
        System.out.println(name.equals(name1));
    }
}
