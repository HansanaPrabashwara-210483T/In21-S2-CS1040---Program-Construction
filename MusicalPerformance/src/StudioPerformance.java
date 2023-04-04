import java.util.ArrayList;

public class StudioPerformance extends Performance {

    StudioPerformance(String name, MainArtist mainArtist, String venue, int year, ArrayList<Track> trackList, ArrayList<BackUpDancer> backUpDancersList, ArrayList<BackUpSinger> backUpSingersList) {
        super(name, mainArtist, venue, year, trackList, backUpDancersList, backUpSingersList);
    }

    public void audioProcessing(){
        System.out.println(getMainArtist().getName()+"'s song is under audio processing.");
    }

    public void record(){
        System.out.println("Studio performance is being recorded.");
    }
}
