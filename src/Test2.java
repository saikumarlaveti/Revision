
interface  demo{
    void add();
}
class Test{
    public void say(){
        System.out.println("Hello Saikumar");
    }
    public static void main(String[] args) {
        Test t = new Test();
        demo i = t ::say;
        i.add(); // Hello Saikumar
    }
}