package practice07;

public class Student extends Person{
    public Klass klass;
    public Student(String tom, int i,Klass j) {
        super(tom,i);
        klass=j;
    }
    public Klass getKlass() {
        return klass;
    }
    public String introduce() {
        return super.introduce()+" I am a Student. I am at Class "+klass.number+".";
    }
}
