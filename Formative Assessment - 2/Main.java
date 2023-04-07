import java.util.ArrayList;

// This is the main function to create instances
public class Main {
    public static void main(String[] args) {
        // Create a main artist object
        MainArtist mainartist = new MainArtist("Taylor Swift");

        // Create backup singer objects
        BackUpSinger singer1 = new BackUpSinger("Jeslyn");
        BackUpSinger singer2 = new BackUpSinger("Melanie");

        // Add backup singers into a list
        ArrayList<BackUpSinger> backupsingers = new ArrayList<BackUpSinger>();
        backupsingers.add(singer1);
        backupsingers.add(singer2);

        // Create backup dancers objects
        BackUpDancer dancer1 = new BackUpDancer("Stephanie");
        BackUpDancer dancer2 = new BackUpDancer("Jake");

        // Add backup da into a list
        ArrayList<BackUpDancer> backupdancers = new ArrayList<BackUpDancer>();
        backupdancers.add(dancer1);
        backupdancers.add(dancer2);

        // Create track objects
        Track track1 = new Track("Lavender Haze the lakes");
        Track track2 = new Track("All Too Well");
        Track track3 = new Track("The Man");
        Track track4 = new Track("Love Story");

        // Add tract to a list
        ArrayList<Track> tracklist = new ArrayList<Track>();
        tracklist.add(track1);
        tracklist.add(track2);
        tracklist.add(track3);
        tracklist.add(track4);

        // Creating a live performance object
        LivePerformance performance1 = new LivePerformance("Eras Tour",mainartist,
                "Glendale",2023,tracklist,backupdancers,backupsingers);

        // Start recoding
        performance1.record();
        // Main artist interact with the audience
        performance1.interact();
        // Get the year
        System.out.println("Year : "+performance1.getYear());
        // get the venue
        System.out.println("Venue : "+performance1.getVenue()+"\n");;


        // Make backup dancers backup the main artist
        performance1.getBackUpDancersList().get(0).backup();
        performance1.getBackUpDancersList().get(1).backup();

        // Make backup singers backup the main artist
        performance1.getBackUpSingersList().get(0).backup();
        performance1.getBackUpSingersList().get(1).backup();

        // Make backup dancers dance
        performance1.getBackUpDancersList().get(0).dance();
        performance1.getBackUpDancersList().get(1).dance();

        // Make backup singers sing
        performance1.getBackUpSingersList().get(0).sing();
        performance1.getBackUpSingersList().get(1).sing();

    }
}