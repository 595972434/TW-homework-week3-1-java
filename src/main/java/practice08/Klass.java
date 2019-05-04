package practice08;

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
        leader=jerry;
    }

    public Student getLeader() {
        return leader;
    }
}
