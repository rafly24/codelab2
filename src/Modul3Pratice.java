import java.util.Scanner;
public class Modul3Pratice {
    private double value;

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Converter converter = new Converter();

        System.out.println("Choose a conversion method:");
        System.out.println("1. yard to m");
        System.out.println("2. yard to centimeters");
        System.out.println("3. yard to feet");
        System.out.println("4. yard to miles");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double result = 0.0;

        Modul3Pratice modul3Pratice = new Modul3Pratice();
        System.out.print("Enter a value: ");
        double value = scanner.nextDouble();
        modul3Pratice.setValue(value);


        switch (choice) {
            case 1:
                result = converter.setValuetoM(modul3Pratice.getValue());
                System.out.println("Value in meters: " + result);
                break;
            case 2:
                result = converter.setValuetoCm(modul3Pratice.getValue());
                System.out.println("Value in centimeters: " + result);
                break;
            case 3:
                result = converter.setValuetoFeet(modul3Pratice.getValue());
                System.out.println("Value in feet: " + result);
                break;
            case 4:
                result = converter.setValuetoMiles(modul3Pratice.getValue());
                System.out.println("Value in miles: " + result);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}