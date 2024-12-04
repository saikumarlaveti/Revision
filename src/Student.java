import java.util.*;
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id: " + id + " name: " + name;
    }

        public static void main(String[] args) {
            List<Student> std = new ArrayList<>();
            std.add(new Student(1, "Saikumar"));
            std.add(new Student(2, "Hari"));
            std.add(new Student(3, "Lokesh"));

            Comparator<Student> com = new Comparator<Student>() {
                @Override
                public int compare( Student o1, Student o2) {
                    if(o1.name.length()>o2.name.length()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
            };

            Comparator<Student> com1 = new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if(o1.id>o2.id){
                        return 1;
                    }
                    else
                        return -1;
                }
            };
            Collections.sort(std,com);
            System.out.println(std);

            Collections.sort(std,com1);
            System.out.println(std);


        }
    }
