package Stuff;
public class TemperatureConversion {

    /**  Write a class that contains the following two methods:  */

    // Convert from Celsius to Fahrenheit
    // Formula to convert is fahrenheit = (9.0 / 5) * celsius + 32
    public static double celsiusToFahrenheit(double celsius) {
        return celsius;
    }

    // Convert from Fahrenheit to Celsius
    // Formula to convert is celsius = (5.0 / 9) * (fahrenheit - 32)
    public static double fahrenheipToCelsius(double fahrenheit) {
        return fahrenheit;
    }

    /** Write a main method that uses the previous methods to display the following table
     *     Celsius      Fahrenheit      |       Fahrenheit      Celsius
     *     ------------------------------------------------------------
     *     40.0         104.0           |       120.0           48.89
     *     39.0         102.2           |       110.0           43.33
     *     ...
     *     32.0         89.6            |       40.0            4.44
     *     31.0         87.8            |       30.0            -1.11
     *
     */
    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit\t\t|\tFahrenheit\t\tCelsius");
        System.out.println("-------------------------------------------------------");

    }
}
