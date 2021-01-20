package oops.singletons;

public class AppConfig {

    private AppConfig() {
    //
    }

    private static AppConfig obj = null;

    public static AppConfig getInstance() {

        if (obj == null) {
            obj = new AppConfig();      // it is lazy but optimized method..
        }
        return obj;
    }
}
