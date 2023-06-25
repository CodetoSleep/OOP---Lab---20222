package Lab_03.src.AimsProject.hust.soict.dsai.aims.media;

import Lab_03.src.AimsProject.hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public void Play() throws PlayerException {
        if (getLength() > 0) {
            System.out.println("Playing DVD: " + getTitle());
            System.out.println("DVD length: " + getLength());
        } else {
            throw new PlayerException("DVD length is non-positive");
        }
    }

}
