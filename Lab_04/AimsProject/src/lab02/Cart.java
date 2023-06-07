package Lab_04.AimsProject.src.lab02;
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
}
