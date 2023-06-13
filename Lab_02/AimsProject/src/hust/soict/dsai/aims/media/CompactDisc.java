package hust.soict.dsai.aims.media;

import javax.print.attribute.standard.Media;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc() {
        super();
        tracks = new ArrayList<Track>();
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Getters

    public String getArtist() {
        return artist;
    }
}
