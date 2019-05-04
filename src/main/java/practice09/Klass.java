package practice09;

import java.io.PrintStream;

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
