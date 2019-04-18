package practice07;

public class Teacher extends Person{
    public Klass klass=null;
    public Teacher(String tom, int i,Klass j) {
        super(tom,i);
        klass=j;
    }
    public Teacher(String tom, int i) {
        super(tom,i);
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

