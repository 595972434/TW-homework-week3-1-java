package practice09;

public class Person {
    public String name;
    public int age;
    public int id;
    public Person(int j,String tom, int i) {
        name=tom;
        age=i;
        id=j;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String introduce() {
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }
}
