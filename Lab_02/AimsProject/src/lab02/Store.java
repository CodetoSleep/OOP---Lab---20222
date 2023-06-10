package lab02;

public class Store {
    public static final int Max_number_ordered = 20;

    int qtyOrdered = 0;
    private final DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[Max_number_ordered];
    public void addDigitalVideDisc(DigitalVideoDisc dvd){
        if(qtyOrdered > Max_number_ordered) System.out.println("Store is full");
        else {
            itemsInStore[qtyOrdered] = dvd;
            System.out.println("The item has been added");
            qtyOrdered++;
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
      int k = -1;
      if(qtyOrdered == 0) System.out.println("Store is empty");
      else{
          for(int i = 0; i < Max_number_ordered; i++){
              if(disc.getId() == itemsInStore[i].getId()){
                  k = i;
                  break;
              }
          }
          DigitalVideoDisc temp[] = new DigitalVideoDisc[Max_number_ordered];
          if(k == -1) System.out.println("Not found");
          else{
              for(int i = k; i < qtyOrdered - 1; i++){
                  itemsInStore[i] = itemsInStore[i+1];
              }
          }
      }
      qtyOrdered--;
    }
}
