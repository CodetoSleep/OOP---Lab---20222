package lab01;
import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array's length: ");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("After sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        avg = (double) sum/n;
        System.out.println("Sum: "+ sum);
        System.out.println("Avg: "+ avg);
    }
}