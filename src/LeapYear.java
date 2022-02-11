/*
 * @author Mark Kim
 *
 * Jan, Mar, May, Jul, Aug, Oct, and Dec have 31 days
 * Apr, Jun, Sept, and Nov have 30 days
 * Feb has 28 days, but has 29 days on a leap year
 * Leap years occur every 4 years, EXCEPT on the 100th year, but DO occur on the 400th year.
 *
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Declare and initialize Scanner object
        Scanner input = new Scanner(System.in);

        // Request month and year input
        System.out.println("Determine the number of days in a month in a particular year.");
        System.out.println("Please enter a month and year (MM/YYYY): ");
        String date = input.nextLine(); // input.nextLine() retrieves the entire String in
                                        // the line preceding the moment the user presses ENTER


        // This section has simple code to parse data with no validation; you do not need to know this:
        String[] arrDate = date.split("/", 2);
        int month = Integer.parseInt(arrDate[0]);
        int year = Integer.parseInt(arrDate[1]);
        // End of section that you don't need to know

        // Declare number of days variable
        int numDays = 0;

        switch (month) {

            // Cases for months with 31 days
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDays = 31; break;

            // Cases for months with 30 days
            case 4: case 6: case 9: case 11:
                numDays = 30; break;

            // For the month of Feb
            case 2:
                if (year % 100 == 0) {      // check to see if the year is a century
                    if (year % 400 == 0) {  // check to see if the year is on a 400th year
                        numDays = 29;       // if on a 400th year, 29 days
                    } else {
                        numDays = 28;       // else if year is on 100th year, 28 days
                    }
                } else if (year % 4 == 0) { // if not 100th year, check if on a 4th year
                    numDays = 29;           // if on a 4th year, 29 days
                } else {
                    numDays = 28;           // else 28 days
                }
                break;
            default:
                System.out.println("Invalid month.");
                System.exit(0);
        }
        System.out.println("Number of days = " + numDays);
    }
}
