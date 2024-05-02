package src.edu.csc1060.menus;

import java.util.Scanner;

import src.edu.csc1060.ProjectSelector;

public class ASCIIMenu {
    public void openMenu(Scanner input) {
        showMenu(input);
    }

    /**
     * Shows the ASCII Table Menu
     */
    private void showMenu(Scanner input) {
        System.out.println("ASCII Table");
        System.out.println("+-----+-----+-------+---------------------------+");
        System.out.println("| Dec | Hex | Char  | Description               |");
        System.out.println("+-----+-----+-------+---------------------------+");

        for (int i = 0; i <= 127; i++) {
            char character = (char) i;
            String hex = Integer.toHexString(i).toUpperCase();
            String description = processCharacterDescription(i);
            if (i <= 31 || i == 127) {
                System.out.printf("| %3d | %3s | %5s | %-25s |\n", i, getProperHex(hex), "", description);
            } else {
                System.out.printf("| %3d | %3s | %5c | %-25s |\n", i, getProperHex(hex), character, description);
            }

        }

        System.out.println("+-----+-----+-------+---------------------------+");

        ProjectSelector.stall(input);
    }

    /**
     * Ensures the hex is in double digit format
     * 
     * @param hex Hex String
     * @return 2-digit hex
     */
    private String getProperHex(String hex) {
        return hex.length() < 2 ? "0" + hex : hex;
    }

    /**
     * Turns char into description
     * 
     * @param i char
     * @return description
     */
    private String processCharacterDescription(int i) {
        switch (i) {
            case 0:
                return "Null";
            case 1:
                return "Start of Heading";
            case 2:
                return "Start of Text";
            case 3:
                return "End of Text";
            case 4:
                return "End of Transmission";
            case 5:
                return "Enquiry";
            case 6:
                return "Acknowledgment";
            case 7:
                return "Bell";
            case 8:
                return "Backspace";
            case 9:
                return "Horizontal Tab";
            case 10:
                return "Line feed";
            case 11:
                return "Vertical Tab";
            case 12:
                return "Form feed";
            case 13:
                return "Carriage return";
            case 14:
                return "Shift Out";
            case 15:
                return "Shift In";
            case 16:
                return "Data Link Escape";
            case 17:
                return "Device Control 1";
            case 18:
                return "Device Control 2";
            case 19:
                return "Device Control 3";
            case 20:
                return "Device Control 4";
            case 21:
                return "Negative Acknowledgement";
            case 22:
                return "Synchronous Idle";
            case 23:
                return "End of Transmission Block";
            case 24:
                return "Cancel";
            case 25:
                return "End of Medium";
            case 26:
                return "Substitute";
            case 27:
                return "Escape";
            case 28:
                return "File Separator";
            case 29:
                return "Group Separator";
            case 30:
                return "Record Separator";
            case 31:
                return "Unit Separator";
            case 32:
                return "Space";
            case 127:
                return "Delete";
            default:
                return "";
        }
    }
}
