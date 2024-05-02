/**
 * Daniel Wedding
 * Assignment 4 Problem 3
 * Generate a plate number with format XXXXYYY or YYYXXXX (X: int, Y: String)
 */
public class Assignment4Problem3 {
    public static void main(String[] args) {
        choosePlate();
    }

    public static void choosePlate() {
        double r = Math.random() * 2;
        if (r < 1.5)
            choosePlateOne();
        else
            choosePlateTwo();
    }

    public static void choosePlateOne() {
        int rand4 = generateRandNum(1000, 9999);
        String str3 = generateRandString(3);
        System.out.println(String.format("Plate Number: %s%s", String.valueOf(rand4), str3));
    }

    public static void choosePlateTwo() {
        int rand4 = generateRandNum(1000, 9999);
        String str3 = generateRandString(3);
        System.out.println(String.format("Plate Number: %s%s", str3, String.valueOf(rand4)));
    }

    public static int generateRandNum(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String generateRandString(int len){
        String CharOpts = "ABCDEFGHJLMNPRSTUVWXYZ";
        
        String newStr = "";

        for(int i = 0; i < len; i++){
            int option = (int)(Math.round(Math.random() * CharOpts.length()));
            newStr += CharOpts.charAt(option);
        }

        return newStr;
    }
}
