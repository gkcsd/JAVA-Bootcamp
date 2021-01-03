package encapsulations;

public class Student {

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 20) {
            System.out.println("You are too much old to join our nursery");
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
