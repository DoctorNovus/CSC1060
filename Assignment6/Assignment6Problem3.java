import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/01/24
 * 
 * Assignment6Problem3
 * Temperature Calculator
 */
public class Assignment6Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your starting Fahrenheit value: ");
        int startingFah = input.nextInt();

        if (startingFah % 5 >= 4)
            startingFah = 5 * ((startingFah / 5) + 1);
        else if (startingFah % 5 != 0)
            startingFah = 5 * (startingFah / 5);

        int startingCel = ((startingFah - 20) / 5) * 2;

        System.out.printf("%7s %10s | %10s %7s\n", "Celsius", "Fahrenheit",
                "Fahrenheit", "Celsius");
        for (int i = 0; i < 51; i++) {
            double celciusCounter = i * 2;
            double initialCelcius = startingCel + celciusCounter;
            double convertedCelsius = initialCelcius * 1.8 + 32;

            double fahrenheitCounter = i * 5;
            double initialFahrenheit = startingFah + fahrenheitCounter;
            double convertedFahrenheit = (initialFahrenheit - 32) * 5 / 9;
            System.out.printf("%-7.0f %10.3f | %-10.0f %7.3f\n", initialCelcius,
                    convertedCelsius, initialFahrenheit,
                    convertedFahrenheit);
        }
    }
}
