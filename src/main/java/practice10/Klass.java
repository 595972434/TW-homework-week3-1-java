package practice10;

public class Klass {
    public int number;
    public Student leader;
    public Klass(int n){
        number=n;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }

    public boolean isIn(Student jerry){
        if(jerry.klass.number==this.number){
            return true;
        }
        else{
            return false;
        }
    }

    public void assignLeader(Student jerry) {
        if(jerry.klass.number!=this.number){
            System.out.print("It is not one of us.\n");
        }
        else{
            leader=jerry;
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student jerry) {
        jerry.klass.number=this.number;
    }
}
