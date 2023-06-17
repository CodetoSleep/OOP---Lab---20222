package OtherProject.hust.soict.dsai.lab01;

import java.util.Scanner;

public class Add_matrix {
    public static void main(String[] args) {
        int row,col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix row: ");
        row = sc.nextInt();
        System.out.print("Enter matrix col: ");
        col = sc.nextInt();
        int[][] arr1 = new int[row][col], arr2 = new int[row][col], arr = new int[row][col];
        System.out.println("Enter element of matrix 1: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter element of matrix 2: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of matrix 1 and matrix 2:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
