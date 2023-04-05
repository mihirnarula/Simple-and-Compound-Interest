package simplecompundinerest;
import java.util.*;
public class Simplecompundinerest {

    void simple(){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter principle balance: ");
        int p = s.nextInt();
        System.out.print("Enter annual interest rate: ");
        int r = s.nextInt();
        System.out.print("Enter time in years: ");
        int t = s.nextInt();
        
        int A = p * (1 + (r*t));
        
        System.out.println("Final amount: " + A);
    }
    
    void compound(){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter principle balance: ");
        int p = s.nextInt();
        System.out.print("Enter interest rate: ");
        int r = s.nextInt();
        System.out.print("Number of times interest applied per time period");
        int n = s.nextInt();
        System.out.print("Enter number of time periods elapsed: ");
        int t = s.nextInt();
        
        double A = p * Math.pow(1 + (r/n),n*t);
        System.out.println("Final amount: " + A);

        
    }
    
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to find simple interest and 2 to find compund interest: ");
        int num = sc.nextInt();
        
        Simplecompundinerest ob = new Simplecompundinerest();
        
        switch (num) {
            case 1:
                ob.simple();
                break;
            case 2:
                ob.compound();
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
        
    }
    
}
