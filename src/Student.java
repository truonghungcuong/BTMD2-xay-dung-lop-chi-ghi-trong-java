public class Student {
    String name="Cường";
    String classes="C02";
    public Student(){
    }
    public Student(String name,String classes){
        this.name=name;
        this.classes=classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
