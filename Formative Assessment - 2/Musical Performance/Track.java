// Class to create tracks for the performances
public class Track {
    private String name; // name of the track
    private float duration; // duration of the track

    // Constructor when duration is specified
    Track(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    // Construction when only name is specified
    Track(String name){
        this.name = name;
    }

    // getter method to the track name
    public String getName() {
        return name;
    }

    // Getter method to the track duration
    public float getDuration() {
        return duration;
    }

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Set method for the duration
    public void setDuration(float duration) {
        this.duration = duration;
    }
}
