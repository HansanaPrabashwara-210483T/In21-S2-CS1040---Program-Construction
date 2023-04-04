import java.util.ArrayList;

// This work as the super class to the live performance class and the studio performance class.
public class Performance {
    private MainArtist mainArtist;
    private String name;
    private final int year;
    private final String venue;
    private ArrayList<Track> trackList;
    private ArrayList<BackUpSinger> backUpSingersList = new ArrayList<BackUpSinger>();
    private ArrayList<BackUpDancer> backUpDancersList = new ArrayList<BackUpDancer>();

    Performance(String name, MainArtist mainArtist, String venue, int year, ArrayList<Track> trackList,
                ArrayList<BackUpDancer> backUpDancersList, ArrayList<BackUpSinger> backUpSingersList){
        this.name = name;
        this.mainArtist = mainArtist;
        this.venue = venue;
        this.year = year;
        this.trackList = trackList;
        this.backUpDancersList = backUpDancersList;
        this.backUpSingersList = backUpSingersList;

        System.out.println("Welcome to the Performance " +name +" by "+ mainArtist.getName() + "!");

    }
    // Getter method for the year
    public int getYear() {
        return year;
    }
    // Getter method for the venue
    public String getVenue() {
        return venue;
    }
    // Getter method to the main artist
    public MainArtist getMainArtist() {
        return mainArtist;
    }
    // Setter method to the track list
    public void setTrackList(ArrayList<Track> trackList) {
        this.trackList = trackList;
    }
    // Getter method to the backup dancer list
    public ArrayList<BackUpDancer> getBackUpDancersList() {
        return backUpDancersList;
    }
    // Getter method to the backup singer list
    public ArrayList<BackUpSinger> getBackUpSingersList() {
        return backUpSingersList;
    }


}
