import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valueToConvert=0.0;
        String choice=" ";
// Header for your program
        System.out.println("Temperature Converter:");
        System.out.println("=======================");



        while (! choice.equals("q")){

            // Temperature
            System.out.println("Choose Action: F to C (f), C to F (c), Quit(q) : ");
            choice = scan.nextLine().toLowerCase();

            // Temperature Value
            switch (choice){
                case "f" :
                    System.out.println("Enter temperature to convert (fahrenheit) : ");
                    double celsius = Double.parseDouble(scan.nextLine());
                    System.out.println(String.format("%.2f° F = %.2f° C", celsius, (celsius - 32) * 5 / 9));
                    break;

                case "c" :
                    System.out.println("Enter temperature to convert (celsius) : ");
                    double fahrenheitOfC = Double.parseDouble(scan.nextLine());
                    System.out.println(String.format("%.2f° C = %.2f° F", fahrenheitOfC, (fahrenheitOfC * 9/5) + 32));
                    break;
                case "q" :
                    System.out.println("Goodbye. Thanks for using Temperature Converter.");
                    return;
                default:
                    System.out.println("Invalid conversion type. Please try again");
                    break;
            }
        }











    }
}
