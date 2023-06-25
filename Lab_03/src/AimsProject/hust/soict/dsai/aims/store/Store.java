package Lab_03.src.AimsProject.hust.soict.dsai.aims.store;

import Lab_03.src.AimsProject.hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static final int Max_number_ordered = 20;
    private ArrayList<Media> itemOrdered = new ArrayList<Media>();
    public void addMedia(Media disc){
        if(itemOrdered.size()==Max_number_ordered) System.out.println("The store is full");
        else{
            itemOrdered.add(disc);
            System.out.println("The store has been added");
        }
    }
    public void removeMedia(Media disc){
        int check = 0;
        if(itemOrdered.size()==0) System.out.println("The store is empty");
        else{
            for(int i = 0; i < itemOrdered.size(); i++){
                if(itemOrdered.get(i).getId()==disc.getId()){
                    check=1;
                    break;
                }
            }
            if(check==1){
                itemOrdered.remove(disc);
                System.out.println("The store has been updated");
            }else System.out.println("Not found");
        }
    }

    public Media findByTitle(String title) {
        for (Media m : itemOrdered) {
            if (title.equals(m.getTitle())) return m;
        }
        return null;
    }

    private ArrayList<Media> itemsInStore = new ArrayList<>();
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void display(){
        if (itemOrdered.size() == 0){
            System.out.println("Empty!");
        }
        else{
            System.out.println("***********************AimsProject.src.hust.soict.dsai.aims.store.Store***********************");
            for (int i = 0; i < itemOrdered.size(); i++){
                System.out.println(itemOrdered.get(i).getId() + ". DVD - " + itemOrdered.get(i).getTitle() + " - " + itemOrdered.get(i).getCategory() + " - " + ((Disc)itemOrdered.get(i)).getDirector() + " - " + ((Disc)itemOrdered.get(i)).getLength() + ": " + itemOrdered.get(i).getCost() + " $");
            }
//            for(Media m : itemOrdered){
//                System.out.println(m.toString());
//            }
            System.out.println("***************************************************");

        }
    }
}