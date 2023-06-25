package Lab_03.src.AimsProject.hust.soict.dsai.aims.cart;

import Lab_03.src.AimsProject.hust.soict.dsai.aims.media.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    public static final int Max_number_ordered = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    private ObservableList<Media> itemsOrdereded = FXCollections.observableArrayList();

    public ObservableList<Media> getItemsOrdereded() {
        return itemsOrdereded;
    }

    public void addMedia(Media disc){
        if(itemsOrdered.size()==Max_number_ordered) System.out.println("The cart is full");
        else{
            itemsOrdered.add(disc);
            System.out.println("The cart has been added");
        }
    }
    public void removeMedia(Media disc){
        int check = -1;
        if(itemsOrdered.size()==0){
            System.out.println("The cart is empty");
        }
        else{
            for(int i = 0; i < itemsOrdered.size(); i++){
                if(disc.getId()==itemsOrdered.get(i).getId()){
                    check = 1;
                    break;
                }
            }
            if(check==1){
                itemsOrdered.remove(disc);
                if(check==1) System.out.println("The cart has been updated");
            }else{
                System.out.println("Not found");
            }
        }

    }

    public int numberOfMedia() {
        return itemsOrdered.size();
    }

    public float totalCost(){
        float total = 0;
        for(int i = 0; i < itemsOrdered.size(); i++){
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }

//    int qtyOrdered = 0;

//    public void addDigitalVideoDisc(DigitalVideoDisc disc){
//        if(qtyOrdered > Max_number_ordered) System.out.println("The cart is full");
//        else{
//            itemsOrdered[qtyOrdered] = disc;
//            System.out.println("The disc has been added");
//            qtyOrdered++;
//        }
//    }
//    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
//        int k = -1;
//        if(qtyOrdered == 0) System.out.println("The cart is empty");
//        else{
//            for(int i = 0; i < Max_number_ordered; i++) {
//                if (itemsOrdered.get(i).getTitle().equals(disc.getTitle()) && itemsOrdered.get(i).getCategory().equals(disc.getCategory())) {
//                    k = i;
//                    break;
//                }
//            }
//        }
//        DigitalVideoDisc temp[] = new DigitalVideoDisc[Max_number_ordered];
//        if(k == -1) System.out.println("Not found");
//        else{
//            int cnt = 0;
//            for(int i = 0; i < Max_number_ordered; i++){
//                if(i != k){
//                    temp[cnt] = itemsOrdered.get(i);
//                    cnt++;
//                }
//            }
//        }
//        qtyOrdered--;
//    }

    public void display(){
        if (itemsOrdered.size() == 0){
            System.out.println("Empty!");
        }
        else{
            System.out.println("***********************CART***********************");
            for (int i = 0; i < itemsOrdered.size(); i++){
                System.out.println(itemsOrdered.get(i).getId() + ". DVD - " + itemsOrdered.get(i).getTitle() + " - " + itemsOrdered.get(i).getCategory() + " - " + ((Disc)itemsOrdered.get(i)).getDirector() + " - " + ((Disc)itemsOrdered.get(i)).getLength() + ": " + itemsOrdered.get(i).getCost() + " $");
            }
            System.out.println("Total cost: " + totalCost());
            System.out.println("***************************************************");
        }
    }

    public void searchID(int id){
        int exist = 0;
        for (int i = 0; i < itemsOrdered.size(); i++){
            if (itemsOrdered.get(i).getId() == id){
                System.out.println(itemsOrdered.get(i).getId() + ". DVD - " + itemsOrdered.get(i).getTitle() + " - " + itemsOrdered.get(i).getCategory() + " - " + ((Disc)itemsOrdered.get(i)).getDirector() + " - " + ((Disc)itemsOrdered.get(i)).getLength() + ": " + itemsOrdered.get(i).getCost() + " $");
                exist++;
                break;
            }
        }
        if (exist == 0){
            System.out.println("Not found!");
        }
    }

    public void searchTitle(String title){
        int exist = 0;
        for (int i = 0; i < itemsOrdered.size(); i++){
            if (itemsOrdered.get(i).getTitle().equals(title)){
                System.out.println(itemsOrdered.get(i).getId() + ". DVD - " + itemsOrdered.get(i).getTitle() + " - " + itemsOrdered.get(i).getCategory() + " - " + ((Disc)itemsOrdered.get(i)).getDirector() + " - " + ((Disc)itemsOrdered.get(i)).getLength() + ": " + itemsOrdered.get(i).getCost() + " $");
                exist++;
                break;
            }
        }
        if (exist == 0){
            System.out.println("Not found!");
        }
    }

    public void sortByTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }

    public void removeAllMedia() {
        itemsOrdered.removeAll(itemsOrdered);
    }

    public Media findByTitle(String title) {
        for (Media m : itemsOrdered) {
            if (title.equals(m.getTitle())) return m;
        }
        return null;
    }
}
