package lab01;

import java.lang.Math;
import java.util.Scanner;

public class Second_Degree_Equation {
    public static void main(String[] args) {
        double a, b, c, delta;
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = Obj.nextDouble();
        System.out.println("Enter b: ");
        b = Obj.nextDouble();
        System.out.println("Enter c: ");
        c = Obj.nextDouble();
        if(a == 0){
            if(b == 0 && c != 0) System.out.println("Vo nghiem");
            if(b == 0 && c == 0) System.out.println("Vo so nghiem");
            if(b != 0) System.out.println(-b/a);
        }else{
            delta = b*b - 4*a*c;
            if(delta == 0){
                System.out.println("Nghiem boi 2: "+-b/2*a);
            }else{
                System.out.println("Nghiem 1: "+(-b+Math.sqrt(delta))/(2*a));
                System.out.println("Nghiem 2: "+(-b-Math.sqrt(delta))/(2*a));
            }

        }
    }
}