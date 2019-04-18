package practice07;

public class Klass {
    public int number;
    public Klass(int n){
        number=n;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }
}
