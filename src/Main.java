import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //request and receive scanner input for radius value
        System.out.println("Enter radius value to be converted.");
        System.out.print("r = ");
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();

        //prints out results, calling to methods
        System.out.println("Circumference: " + circleCalculationMethods.circumferenceCalc(r));
        System.out.println("Area: " + circleCalculationMethods.areaCalc(r));
        System.out.println("Diameter: " + circleCalculationMethods.diameterCalc(r));

    }
}