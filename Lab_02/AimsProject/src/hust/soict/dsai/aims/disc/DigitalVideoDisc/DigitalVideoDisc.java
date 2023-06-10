package hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDisc = 0;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCost() {
        return cost;
    }

    public int getLength() {
        return length;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DigitalVideoDisc(String title){
        this.title = title;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }
    public DigitalVideoDisc(String category, String title, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }
    public DigitalVideoDisc(String director, String category, String title, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.director = director;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }
    public DigitalVideoDisc(String director, String category, String title, int length, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.director = director;
        this.length = length;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }

}
