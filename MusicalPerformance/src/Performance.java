import java.util.ArrayList;
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

    public int getYear() {
        return year;
    }

    public String getVenue() {
        return venue;
    }

    public MainArtist getMainArtist() {
        return mainArtist;
    }

    public void setTrackList(ArrayList<Track> trackList) {
        this.trackList = trackList;
    }

    public ArrayList<BackUpDancer> getBackUpDancersList() {
        return backUpDancersList;
    }

    public ArrayList<BackUpSinger> getBackUpSingersList() {
        return backUpSingersList;
    }


}
