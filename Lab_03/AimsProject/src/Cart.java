package Lab_03.AimsProject.src;
import lab02.DigitalVideoDisc;

import java.util.Objects;
public class Cart {
    public static final int Max_number_ordered = 20;
    int qtyOrdered = 0;
    private final DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[Max_number_ordered];
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered > Max_number_ordered) System.out.println("The cart is full");
        else{
            itemsOrdered[qtyOrdered] = disc;
            System.out.println("The disc has been added");
            qtyOrdered++;
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        if(qtyOrdered + dvdList.length > Max_number_ordered) System.out.println("The cart is full");
        else{
            for(int i = 0; i < dvdList.length; i++){
                addDigitalVideoDisc(dvdList[i]);
            }
            System.out.println("The disc list has been added");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int k = -1;
        if(qtyOrdered == 0) System.out.println("The cart is empty");
        else{
            for(int i = 0; i < Max_number_ordered; i++) {
                if (itemsOrdered[i].getTitle().equals(disc.getTitle()) && itemsOrdered[i].getCategory().equals(disc.getCategory())) {
                    k = i;
                    break;
                }
            }
        }
        DigitalVideoDisc temp[] = new DigitalVideoDisc[Max_number_ordered];
        if(k == -1) System.out.println("Not found");
        else{
            int cnt = 0;
            for(int i = 0; i < Max_number_ordered; i++){
                if(i != k){
                    temp[cnt] = itemsOrdered[i];
                    cnt++;
                }
            }
        }
        qtyOrdered--;
    }
    public float totalCost(){
        float total = 0;
        for(int i = 0; i < qtyOrdered; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void printListofCart(){
        System.out.println("***********************CART***********************");
        for(int i = 0; i < qtyOrdered; i++){
            System.out.println(i-1+". "+itemsOrdered[i].getId() + " - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " : " + itemsOrdered[i].getCost());
        }
        System.out.println("Total cost: "+totalCost());
    }

    public void searchID(int id){
        int exist = 0;
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i].getId() == id){
                System.out.println(itemsOrdered[i].getId() + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + " $");
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
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i].getTitle().equals(title)){
                System.out.println(itemsOrdered[i].getId() + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + " $");
                exist++;
                break;
            }
        }
        if (exist == 0){
            System.out.println("Not found!");
        }
    }
}
