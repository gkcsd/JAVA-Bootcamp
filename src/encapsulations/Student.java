package encapsulations;

public class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 20) {
            System.out.println("You are too old to be as a student to join our nursery school");
        } else this.age = age;
    }


}