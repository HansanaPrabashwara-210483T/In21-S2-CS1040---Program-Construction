import java.util.ArrayList;

// Create instances of  liver performances
public class LivePerformance extends Performance {

    LivePerformance(String name, MainArtist mainArtist, String venue, int year, ArrayList<Track> trackList,
                    ArrayList<BackUpDancer> backUpDancersList, ArrayList<BackUpSinger> backUpSingersList) {
        super(name, mainArtist, venue, year, trackList, backUpDancersList, backUpSingersList);
    }

    // This method is to illustrate the interaction between the main artist and the audience.
    public void interact(){
        System.out.println(getMainArtist().getName()+ " interacted with the audience.");
    }

    // This class is to illustrate the performance recording.
    public void record(){
        System.out.println("Live performance is being recorded.");
    }
}
