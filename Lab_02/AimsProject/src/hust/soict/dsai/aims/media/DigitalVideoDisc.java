package hust.soict.dsai.aims.media;

import javax.print.attribute.standard.Media;

public class DigitalVideoDisc extends Media implements Playable{

    public void play(){
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD: " + getLength());
    }
}
