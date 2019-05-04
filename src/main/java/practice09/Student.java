package practice09;

public class Student extends Person{
    public Klass klass;
    public Student(int k,String tom, int i,Klass j) {
        super(k,tom,i);
        klass=j;
    }
    public Klass getKlass() {
        return klass;
    }
    public String introduce() {
        if(klass.leader!=this) {
            return super.introduce()+" I am a Student. I am at Class "+klass.number+".";}
        else{
            return super.introduce()+" I am a Student. I am Leader of Class "+klass.number+".";}
    }
}
