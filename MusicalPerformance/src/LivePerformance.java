import java.util.ArrayList;

public class LivePerformance extends Performance {

    LivePerformance(String name, MainArtist mainArtist, String venue, int year, ArrayList<Track> trackList,
                    ArrayList<BackUpDancer> backUpDancersList, ArrayList<BackUpSinger> backUpSingersList) {
        super(name, mainArtist, venue, year, trackList, backUpDancersList, backUpSingersList);
    }

    public void interact(){
        System.out.println(getMainArtist().getName()+ " interacted with the audience.");
    }

    public void record(){
        System.out.println("Live performance is being recorded.");
    }
}
