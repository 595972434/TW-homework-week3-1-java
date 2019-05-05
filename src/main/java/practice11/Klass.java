package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Klass extends Observable {
    public int number;
    public Student leader;
    private List<Observer> observers = new ArrayList<Observer>();
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
            return true; }
        else{
            return false; }
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(String message){
        for (Observer observer : observers) {
            observer.update(this,message);
        }
    }

    public void assignLeader(Student jerry) {
        if(jerry.klass.number!=this.number){
            System.out.print("It is not one of us.\n");
        }
        else{
            leader=jerry;
            setChanged();
            notifyAllObservers(". I know Jerry become Leader of Class "+this.number+".\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student jerry) {
        jerry.klass.number=this.number;
        setChanged();
        notifyAllObservers(". I know Jerry has joined Class "+this.number+".\n");
    }
}
