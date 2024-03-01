/*
 * Daniel Wedding - CompSci 1060 - 02/23/24
 * Assignment5Problem3
 * Temperature Converter
 */
public class Assignment5Problem3 {
    public static void main(String[] args) {
        System.out.printf("%7s %10s | %10s %7s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        int i = 0;

        do {
            double celciusCounter = i * 2;
            double initialCelcius = 0.0f + celciusCounter;
            double convertedCelsius = initialCelcius * 1.8 + 32;

            double fahrenheitCounter = i * 5;
            double initialFahrenheit = 20.0f + fahrenheitCounter;
            double convertedFahrenheit = (initialFahrenheit - 32) * 5 / 9; // - 32 * (5/9);
            System.out.printf("%-7.0f %10.3f | %-10.0f %7.3f\n", initialCelcius, convertedCelsius, initialFahrenheit,
                    convertedFahrenheit);
            i++;
        } while (i < 51);
    }
}
