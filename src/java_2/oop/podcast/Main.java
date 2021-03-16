package java_2.oop.podcast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*	Do the following tasks here in the main method, or in methods on this LambdaMain class.
			Create 9 podcasts.
			Create 3 Podcasting Apps
			Load 3 podcasts in each of the podcasting apps
			 - play and stop a podcast in one of the podcasting apps
			 - go to the next() and previous() podcasts in the 2nd podcasting app
			 - stop() the playing podcast on the 2nd podcasting app
			 - put a podcast on repeat() in the 3rd podcasting app.
       		 - show the playlist in the 3rd podcasting app
       		 - remove a podcast from the playlist in the 3rd podcasting app
		 */

		Podcast podOne = new Podcast("Mystery", "John", "10:00");
		Podcast podTwo = new Podcast("Truth", "Darrell", "20:00");
		Podcast podThree = new Podcast("Docs", "Ace", "30:00");
		Podcast podFour = new Podcast("TheShip", "Treat", "40:00");
		Podcast podFive = new Podcast("Sports", "Scooter", "50:00");
		Podcast podSix = new Podcast("Music", "Eric", "60:00");
		Podcast podSeven = new Podcast("Podcast", "Cam", "10:10");
		Podcast podEight = new Podcast("Stuff", "Pat", "20:20");
		Podcast podNine = new Podcast("Happy", "Merv", "30:30");

		List<Podcast> playlistOne = new ArrayList<Podcast>(Arrays.asList(podOne, podTwo, podThree));
		List<Podcast> playlistTwo = new ArrayList<Podcast>(Arrays.asList(podFour, podFive, podSix));
		List<Podcast> playlistThree = new ArrayList<Podcast>(Arrays.asList(podSeven, podEight, podNine));

		PodcastingApp appOne = new PodcastingApp("RealPod", playlistOne);
		PodcastingApp appTwo = new PodcastingApp("RealPod", playlistTwo);
		PodcastingApp appThree = new PodcastingApp("RealPod", playlistThree);

		PodcastingApp.play("Sports");
		appThree.next(podNine);
		PodcastingApp.previous(podThree);
		PodcastingApp.stop();
		appThree.loadPlaylist(playlistOne);
		System.out.println(appThree);
		appThree.removeFromPlaylist(podEight);
	}

}
