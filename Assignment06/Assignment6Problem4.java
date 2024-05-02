import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/01/24
 * 
 * Assignment6Problem4
 * Calculate Mean and Standard Deviation
 */
public class Assignment6Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Sample Set: 1 2 3 4 5 6 7 8 9 10
        System.out.print("Enter 10 numbers: ");
        String dataString = input.nextLine();
        String[] dataSet = dataString.split(" ");
        int[] dataNumbers = new int[dataSet.length];
        for(int i = 0; i < dataSet.length; i++){
            dataNumbers[i] = Integer.parseInt(dataSet[i]);
        }
        
        double mean = calculateMean(dataNumbers);
        
        double deviation = calculateDeviation(dataNumbers, mean);

        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Deviation: %.2f\n", deviation);
    }

    public static double calculateMean(int[] args){
        double sum = 0;
        double total = args.length;

        for(int i = 0; i < total; i++){
            sum += args[i];
        }

        return sum / total;
    }

    public static double calculateDeviation(int[] args, double mean){
        double[] deviationSet = new double[args.length];
        for(int i = 0; i < args.length; i++){
            deviationSet[i] = Math.pow(args[i] - mean, 2);
        }

        double sum = 0;

        for(int i = 0; i < deviationSet.length; i++){
            sum += deviationSet[i];
        }

        double quotient = sum / args.length;

        return Math.sqrt(quotient);
    }
}
