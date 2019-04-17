package practice04;

public class Person {
    public String name;
    public int age;
    public Person(String tom, int i) {
        name=tom;
        age=i;
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


