package practice06;

public class Teacher extends Person{
    public int klass=0;
    public Teacher(String tom, int i,int j) {
        super(tom,i);
        klass=j;
    }
    public Teacher(String tom, int i) {
        super(tom,i);
    }
    public int getKlass() {
        return klass;
    }
    public String introduce() {
        if(klass==0){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        else{
            return super.introduce()+" I am a Teacher. I teach Class "+this.klass+".";
        }
    }
}
