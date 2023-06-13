package hust.soict.dsai.aims.media;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title, category;
    private float cost;
     private List<String> authors = new ArrayList<String>();
     public Book(){

     }

    public void setId(int id) {
        this.id = id;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthors(String authorName) {
        if (!authors.contains(authorName)) authors.add(authorName);
    }
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }
}
