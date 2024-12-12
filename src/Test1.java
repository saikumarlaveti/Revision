public class Test1 {
    public static Test1 ref;
    private Test1(){
        System.out.println("Private Constructor");
    }
    public static Test1  getInstance(){
        if(ref == null){
            ref =  new Test1();
        }
        return ref;
    }
    public String name(String name){
        return name;
    }
}
