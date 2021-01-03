package encapsulations;

public class EncapsulationIntroduction {
    public static void main(String[] args) {

        Student obj = new Student();

        obj.setAge(22);
        System.out.println(obj.getAge());

        obj.setName("Rajesh");
        System.out.println(obj.getName());
    }
}
