public class Main {
    public static void main(String[] args) {
        Student student1=new Student();
        System.out.println(student1.getName()+" "+student1.getClasses());
        Student student2=new Student();
        student2.setName("Đức");
        student2.setClasses("C03");
        System.out.println(student2.getName()+" "+student2.getClasses());
    }
}
