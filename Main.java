import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 GBP");
        System.out.println("2 USD");
        System.out.println("3 CNY");

        // Take an input in
        Scanner sc = new Scanner(System.in);

        // Choose currency
        System.out.println("Press the number corresponding to your first currency");
        int choice = sc.nextInt();

        // Choose amount
        System.out.println("Enter how much you want to convert");
        double amount = sc.nextDouble(); // Use nextDouble for double input

        // Switch based on choice to call the appropriate function
        switch (choice) {
            case 1:
                GBPtoOther(amount);
                end();
                break;
            case 2:
                USDtoOther(amount);
                end();
                break;
            case 3:
                CNYtoOther(amount);
                end();
                break;
            default:
                System.out.println("You have not selected the right option");
        }
        sc.close(); // Close scanner after use
    }

    public static void GBPtoOther(double amount) {
        System.out.println(round(amount)+" GBP " + "is " + round(amount * 1.30) + " USD and is worth " + round(amount * 9.23) + " CNY");
    }

    public static void USDtoOther(double amount) {
        System.out.println(round(amount) +" USD "+ "is " + round(amount / 1.30) + " GBP and is worth " + round(amount * 7.12) + " CNY");
    }

    public static void CNYtoOther(double amount) {
        System.out.println(round(amount) + " CNY "+ "is " + round(amount / 9.23) + " GBP and is worth " + round(amount / 7.12) + " USD");
    }

    public static void end() {
        System.out.println("In today's prices");
    }

    // Method to round a double to two decimal places
    public static double round(double amount) {
        return Math.round(amount * 100) / 100.0;
    }
}
