public class Track {
    private String name;
    private float duration;

    Track(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    Track(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
