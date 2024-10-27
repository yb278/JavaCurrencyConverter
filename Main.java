//Library to ask for data inputs
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("1 GBP");
        System.out.println("2 USD");
        System.out.println("3 CN¥");

        //Take an input in
        Scanner sc = new Scanner(System.in);

        //Choose currency
        System.out.println("Press the number corresponding to your first currency");
        int choice = sc.nextInt();

        //Choose amount
        System.out.println("Enter how much you want to convert");
        double amount =sc.nextInt();

        switch (choice){//This will call functions to convert GBP USD OR CNY to all the others 
            case 1:
                GBPtoOther(amount);
                break;
            case 2:
                //function2(amount);
                    break;
            case 3:
                //function3(amount);
                    break;
            default:
                System.out.println("You have not selected the right option");

        }
    }

    public static void GBPtoOther(double amount){
        System.out.println(amount);


    }
}
