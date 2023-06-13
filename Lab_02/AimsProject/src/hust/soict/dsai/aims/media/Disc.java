package hust.soict.dsai.aims.media;

import javax.print.attribute.standard.Media;

public class Disc extends Media {
    private int length;
    private String director;
    public Disc(){
        super();
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}
