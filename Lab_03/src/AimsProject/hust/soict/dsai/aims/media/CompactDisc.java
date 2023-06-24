package Lab_03.src.AimsProject.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
    }

    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public CompactDisc(String title, String category, String director, String artist, int length, float cost) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
    public void addTrack(Track track){
        if(!tracks.contains(track)) tracks.add(track);
        else System.out.println("This track is already exist");
    }
    public void removeTrack(Track track){
        if(!tracks.contains(track)) System.out.println("Not found!");
        else tracks.remove(track);
    }

    @Override
    public int getLength() {
        int length=0;
        for(Track track : tracks){
            length++;
        }
        return length;
    }

    @Override
    public void Play(){
        for(Track track : tracks) {
            track.Play();        }
    }
}