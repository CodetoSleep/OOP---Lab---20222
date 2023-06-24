package Lab_03.src.AimsProject.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
//    private int id;
//    private String title;
//    private String category;
//    private float cost;
    private List<String> authors = new ArrayList<String>();
    public Book(String title) {
        super(title);
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }


    public void addAuthor(String authorName){
        if(!authors.contains(authorName)) authors.add(authorName);
        else System.out.println("Author is already exist");
    }
    public void removeAuthor(String authorName){
        if(!authors.contains(authorName)) System.out.println("Author isn't existed");
        else authors.remove(authorName);
    }
}
