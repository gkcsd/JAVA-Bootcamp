package oops.interfacepackage;

public class Persons implements Student, Youtuber {
    public static void main(String[] args) {

        Persons obj = new Persons();
        obj.study();
        obj.makeVideo();
        obj.videoEditor();
        obj.uploadVideo();
    }

    @Override
    public void study() {
        System.out.println("Person is studying");
    }

    @Override
    public void makeVideo() {
        System.out.println("Person is making good Youtube videos");
    }

    @Override
    public void videoEditor() {
        System.out.println("Person uses the final cut pro for youtube video editing");
    }
    @Override
    public void uploadVideo() {
        System.out.println("Person is uploading the videos");
    }
}
