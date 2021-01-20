package oops.singletons;

public class MainClass {
    public static void main(String[] args) {

        AppConfig obj = new AppConfig.getInstance();
        AppConfig obj2 = new AppConfig.getInstance();
        AppConfig obj3 = new AppConfig.getInstance();

    }
}
