package Lab_03.src.AimsProject.hust.soict.dsai.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public Track(int length, String title){
        this.length = length;
        this.title = title;
    }

    @Override
    public void Play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public boolean equals(Object o){
        if (this.title == ((Track) o).getTitle() && this.getLength()== ((Track) o).getLength()) return true;
        return false;
    }
}
