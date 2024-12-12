public class Test2 {
    public static void main(String[] args) {
        Test1 t1 = Test1.getInstance();
        Test1 t2 = Test1.getInstance();
        String name = t1.name("Saikumar");
        System.out.println(name);
        System.out.println(t1.hashCode() + " " + t2.hashCode());

        String name1 = t1.name("Sai");
        System.out.println(name1);
    }
}
