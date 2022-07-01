import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter  year :");
        year = number.nextInt();

        if (year % 4 == 0){
            System.out.println( year +":leap year !");
        }else {
            System.out.println( year +":not leap year !");
        }

    }
}
