package oops.interfacepackage;

public interface VideoEditor {
    void videoEditor();

    //it is concrete method but it causes diamond problem
    default public void uploadVideo() {
        System.out.println("I am uploading the videos");
    }
}
