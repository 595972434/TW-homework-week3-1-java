package practice09;

public class Teacher extends Person{
    public Klass klass=null;
    public Teacher(int k,String tom, int i,Klass j) {
        super(k,tom,i);
        klass=j;
    }
    public Teacher(int k,String tom, int i) {
        super(k,tom,i);
    }
    public Klass getKlass() {
        return klass;
    }
    public String introduce() {
        if(klass==null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        else{
            return super.introduce()+" I am a Teacher. I teach Class "+klass.number+".";
        }
    }

    public String introduceWith(Student jerry) {
        if(jerry.klass.number==this.klass.number){
            return super.introduce()+" I am a Teacher. I teach "+jerry.name+".";
        }
        else{
            return super.introduce()+" I am a Teacher. I don't teach "+jerry.name+".";
        }
    }
}
