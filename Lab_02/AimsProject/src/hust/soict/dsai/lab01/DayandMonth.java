package Lab_01;
import java.util.Scanner;

public class DayandMonth {
    public static int getMonth(String month){
        String[] fullname = {"","January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] abbreviation = {"","Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
        String[] letter = {"","Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] number = {"","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        int m = -1;
        for(int i = 1; i <= 12; i++) {
            if (month.equals(fullname[i]) || month.equals(abbreviation[i]) || month.equals(letter[i]) || month.equals(number[i])) {
                m = i;
                break;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user_month;
        int user_year;
        int leapyear = 0;
        do{
            System.out.println("Nhap Thang: ");
            user_month = sc.next();
            System.out.println("Nhap nam: ");
            user_year = sc.nextInt();
        }while(getMonth(user_month) > 12 || getMonth(user_month) < 1 || (user_year + "").length() < 2 || (user_year + "").length() > 4);
        if(user_year % 4 == 0) leapyear = 1;
        if(user_year % 100 == 0 && user_year % 400 != 0) leapyear = 0;
        if(getMonth(user_month) == 1 || getMonth(user_month) == 3 || getMonth(user_month) == 5 || getMonth(user_month) == 7 || getMonth(user_month) == 8 || getMonth(user_month) == 10 || getMonth(user_month) == 12){
            System.out.println("31 ngay");
        }
        if(getMonth(user_month) == 4 || getMonth(user_month) == 6 || getMonth(user_month) == 9 || getMonth(user_month) == 11){
            System.out.println("30 ngay");
        }
        if(getMonth(user_month) == 2 && leapyear == 1){
            System.out.println("29 ngay");
        }
        if(getMonth(user_month) == 2 && leapyear == 0){
            System.out.println("28 ngay");
        }
        sc.close();
    }
}
