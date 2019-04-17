package practice03;

public class Worker extends Person{
    Worker(String tom, int i){
        super(tom,i);
    }
    public String introduce() {
        return "I am a Worker. I have a job.";
    }
}
