package InterfaceIntro.InnerClass;

public class Song {
    private int duration;
    private String title;

    public Song(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }
}