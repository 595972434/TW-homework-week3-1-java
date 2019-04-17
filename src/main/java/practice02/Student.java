package practice02;

public class Student extends Person{
    public int klass;
    public Student(String tom, int i,int j) {
        super(tom,i);
        klass=j;
    }
    public int getKlass() {
        return klass;
    }
    public String introduce() {
        return "I am a Student. I am at Class "+this.klass+".";
    }
}
