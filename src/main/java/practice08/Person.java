package practice08;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id){
            return false;}
        return true;
    }
}
