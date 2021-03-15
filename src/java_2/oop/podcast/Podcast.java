package java_2.oop.podcast;

class Podcast {

    private String title;
    private String host;
    private String duration;

    public Podcast(String title, String host, String duration) {
        this.title = title;
        this.host = host;
        this.duration = duration;
    }

    public  void playlist(String title, String host, String duration) {
        this.title = title;
        this.host = host;
        this.duration = duration;

    }

    public String getTitle() {

        return title;
    }

    public String getHost() {

        return host;
    }

    public String getDuration() {

        return duration;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "title='" + title + '\'' +
                ", host='" + host + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    /*
		Properties
		   - Title
		   - Host
		   - Duration
		 - **A podcast must exist in the Podcast before it can be added to the playlist (so you can only podcasts that you own.)**
	*/
}
