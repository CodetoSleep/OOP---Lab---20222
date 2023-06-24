package Lab_03.src.AimsProject.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST =
            new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE =
            new MediaComparatorByCostTitle();
    private static int nbMedia = 0;

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbMedia++;
        setId(nbMedia);
    }

    public Media(String title) {
        this.title = title;
        nbMedia++;
        setId(nbMedia);
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Media(){

    }
    public Media(int id, String title, String category, float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o){
        if (this.title == ((Media) o).getTitle()) return true;
        return false;
    }

    public static void main(String[] args) {
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        CompactDisc cd = new CompactDisc("Hello", "Ballad", 5f);
        Book book = new Book("Jungle", "Alan Kay", 12f);

        List<Media> media = new ArrayList<Media>();
        media.add(dvd);
        media.add(cd);
        media.add(book);

        for(Media item : media) {
            System.out.println(item.toString());
        }
    }
}
