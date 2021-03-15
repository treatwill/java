package java_2.oop.podcast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class PodcastingApp {

    String appName;
    List<Podcast> playlist;


    static boolean isPlaying = false;
    static int currentPlay = 0;

    public PodcastingApp(String appName, List<Podcast> playlist) {
        this.appName = appName;
        this.playlist = playlist;
    }

    public String getAppName() {

        return appName;
    }



    public static void play() {

        isPlaying = true;
        System.out.println("Playing");
    }

    public static void stop() {

        isPlaying = false;
        System.out.println("Stopped");
    }

    public void next(List<Podcast> playlist) {

        LinkedList<Podcast> playNext = new LinkedList<Podcast>(playlist);

        playNext.get(playlist.indexOf(""));

    }

    public static void previous(List<Podcast> playlist) {

        currentPlay--;
    }

    public static void repeat() {
        isPlaying = true;
            System.out.println("Replaying your song");

    }

    public static void showPlaylist(List<Podcast> playlist) {

        System.out.println(playlist);
    }

    public void removeFromPlaylist(Podcast podcast) {
        playlist.remove(podcast);
    }

    public void addPodcast(Podcast podcast) {
        playlist.add(podcast);
    }

    public void loadPlaylist(List<Podcast> loadedPod) {

        playlist = loadedPod;
        System.out.println(loadedPod);
    }

    @Override
    public String toString() {
        return "PodcastingApp{" +
                "appName='" + appName + '\'' +
                ", playlist=" + playlist +
                '}';
    }

    /*
	   Properties :
	   - appName (Apple Podcasts, Pocket Casts, Overcast, Google Podcasts, etc.)
       - playlist of Podcasts (with a capital P)

       Methods :
       - loadPlaylist (replace the existing playlist with a new one)
       - addPodcast (add a new podcast to the playlist.  order of the playlist should be maintained.
       - play()
       - stop()
       - next()
       - previous()
       - repeat()
       - showPlaylist()
       - removeFromPlaylist(Podcast)
*/

}

