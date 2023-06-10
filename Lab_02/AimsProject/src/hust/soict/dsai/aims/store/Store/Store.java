package hust.soict.dsai.aims.store.Store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
    public static final int Max_number_ordered = 20;
    int qtyOrdered = 0;
    private final DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[Max_number_ordered];
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered > Max_number_ordered) System.out.println("The store is full");
        else{
            itemsOrdered[qtyOrdered] = disc;
            System.out.println("The item has been added");
            qtyOrdered++;
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int k = -1;
        if(qtyOrdered == 0) System.out.println("The store is empty");
        else{
            for(int i = 0; i < Max_number_ordered; i++) {
                if (itemsOrdered[i].getTitle().equals(disc.getTitle()) && itemsOrdered[i].getCategory().equals(disc.getCategory())) {
                    k = i;
                    break;
                }
            }
        }
        if(k == -1) System.out.println("Not found");
        else{
            for(int i = k; i < qtyOrdered - 1; i++){
                if(i != k){
                    itemsOrdered[i] = itemsOrdered[i+1];
                }
            }
        }
        System.out.println("The item has been deleted");
        qtyOrdered--;
    }

    public void display(){
        if (qtyOrdered == 0){
            System.out.println("Empty!");
        }
        else{
            System.out.println("***********************Store***********************");
            for (int i = 0; i < qtyOrdered; i++){
                System.out.println(itemsOrdered[i].getId() + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + " $");
            }
            System.out.println("***************************************************");
        }
    }
}
