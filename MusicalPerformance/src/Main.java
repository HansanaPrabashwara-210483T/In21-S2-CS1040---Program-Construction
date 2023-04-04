import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // create 
        MainArtist mainartist = new MainArtist("Taylor Swift");

        BackUpSinger singer1 = new BackUpSinger("Jeslyn");
        BackUpSinger singer2 = new BackUpSinger("Melanie");

        ArrayList<BackUpSinger> backupsingers = new ArrayList<BackUpSinger>();
        backupsingers.add(singer1);
        backupsingers.add(singer2);

        BackUpDancer dancer1 = new BackUpDancer("Stephanie");
        BackUpDancer dancer2 = new BackUpDancer("Jake");

        ArrayList<BackUpDancer> backupdancers = new ArrayList<BackUpDancer>();
        backupdancers.add(dancer1);
        backupdancers.add(dancer2);

        Track track1 = new Track("Lavender Haze the lakes");
        Track track2 = new Track("All Too Well");
        Track track3 = new Track("The Man");
        Track track4 = new Track("Love Story");

        ArrayList<Track> tracklist = new ArrayList<Track>();
        tracklist.add(track1);
        tracklist.add(track2);
        tracklist.add(track3);
        tracklist.add(track4);

        LivePerformance performance1 = new LivePerformance("Eras Tour",mainartist,
                "Glendale",2023,tracklist,backupdancers,backupsingers);

        performance1.record();
        performance1.interact();
        performance1.getYear();
        performance1.getVenue();

        performance1.getBackUpDancersList().get(0).backup();
        performance1.getBackUpDancersList().get(1).backup();

        performance1.getBackUpSingersList().get(0).backup();
    }
}