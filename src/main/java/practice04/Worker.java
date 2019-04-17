package practice04;

public class Worker extends Person{
    Worker(String tom, int i){
        super(tom,i);
    }
    public String introduce() {

        return super.introduce()+" I am a Worker. I have a job.";
    }
}
