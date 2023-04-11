import  java.util.Scanner;
public class Leap_year{
    public static void main(String[] args){
        Scanner year=new Scanner(System.in);
        System.out.println("Enter the year:");
        int Year=year.nextInt();
        
        if(Year%400==0){
            System.out.println(Year+" "+"is leap year");
        }
        else if(Year%100==0){
            System.out.println(Year+" "+"is not leap year");
        }
        else if(Year%4==0){
            System.out.println(Year+" "+"is leap year");
        }
        else{
            System.out.println(Year+" "+"is not leap year");
        }
    }
}
