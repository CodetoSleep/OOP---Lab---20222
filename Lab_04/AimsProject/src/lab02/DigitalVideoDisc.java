package Lab_04.AimsProject.src.lab02;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

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
    public DigitalVideoDisc(String title){
        this.title = title;
    }
    public DigitalVideoDisc(String category, String title, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc(String director, String category, String title, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.director = director;
    }
    public DigitalVideoDisc(String director, String category, String title, int length, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.director = director;
        this.length = length;
    }
}
