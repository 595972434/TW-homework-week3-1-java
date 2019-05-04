package practice11;

import java.util.LinkedList;

public class Teacher extends Person{
    public LinkedList<Klass> classes;
    public Teacher(int k, String tom, int i, LinkedList<Klass> j) {
        super(k,tom,i);
        classes=j;
    }
    public Teacher(int k,String tom, int i) {
        super(k,tom,i);
        classes=new LinkedList();
    }
    public LinkedList<Klass> getClasses() {
        return classes;
    }
    public String introduce() {
        if(classes.size()==0){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        else{
            String str="";
            for(int i=0;i<classes.size();i++){
                str=str+classes.get(i).number+", ";
            }
            return super.introduce()+" I am a Teacher. I teach Class "+str.substring(0,str.length()-2)+".";
        }
    }

    public String introduceWith(Student jerry) {
        if(isTeaching(jerry)){
            return super.introduce()+" I am a Teacher. I teach "+jerry.name+".";
        }
        else{
            return super.introduce()+" I am a Teacher. I don't teach "+jerry.name+".";
        }
    }

    public boolean isTeaching(Student jerry) {
        for(int i=0;i<classes.size();i++){
            if(classes.get(i).isIn(jerry)){
                return true;
            }
        }
        return false;
    }
}
