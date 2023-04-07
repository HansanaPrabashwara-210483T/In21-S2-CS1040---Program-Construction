import java.util.ArrayList;

// This class create instances of the performances in studio
public class StudioPerformance extends Performance {

    StudioPerformance(String name, MainArtist mainArtist, String venue, int year, ArrayList<Track> trackList, ArrayList<BackUpDancer> backUpDancersList, ArrayList<BackUpSinger> backUpSingersList) {
        super(name, mainArtist, venue, year, trackList, backUpDancersList, backUpSingersList);
    }

    // Method to audio processing
    public void audioProcessing(){
        System.out.println("This is the method 'audioProcessing()' in the class 'StudioPerformance'.");
        System.out.println(getMainArtist().getName()+"'s song is under audio processing.\n");
    }

    // Method to record
    public void record(){
        System.out.println("This is the method 'record()' in the class 'StudioPerformance'.");
        System.out.println("Studio performance is being recorded.\n");
    }
}
