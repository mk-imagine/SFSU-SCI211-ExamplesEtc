import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

enum status {
  UNDERWEIGHT, HEALTHY, OVERWEIGHT, OBESE
}

public class BMICalculator {
  private static final String mashoufAddress = "755 Font Blvd.";

  public static void displayWelcomeMessage() {
    System.out.println("\n--------------------------------------------------------------------------------------------");
    System.out.println("-- Welcome to:");
    System.out.println("--            BODY MASS INDEX (BMI) Computation, English version");
    System.out.println("--                                                              by Mark Kim");
    System.out.println("--------------------------------------------------------------------------------------------\n");
  }

  public static String promptAndGetUsername(Scanner input) {
    input.reset();
    System.out.print("Please enter your full name: ");
    String username = input.nextLine();
    return username;
  }

  public static int promptAndGetHeightInches(Scanner input, String name) {
    input.reset();
    System.out.printf("Please enter height in feet and inches for %s: ", name);
    int feet = input.nextInt();
    int inches = input.nextInt();
    return feet * 12 + inches;
  }

  public static double promptAndGetWeightPounds(Scanner input, String name) {
    input.reset();
    System.out.printf("Please enter weight in pounds for %s: ", name);
    double weight = input.nextDouble();
    return weight;
  }

  public static double[] promptAndGetWeightRange(Scanner input, String name) {
    input.reset();
    double[] range = new double[2];
    System.out.printf("Please enter a LOW weight in pounds for %s: ", name);
    range[0] = input.nextDouble();
    System.out.printf("Please enter a HIGH weight in pounds for %s: ", name);
    range[1] = input.nextDouble();
    return range;
  }

  public static String getBMIStatus(double bmi) {
    if (bmi < 18.5) {
      return "Underweight";
    } else if (bmi >= 18.5 && bmi < 25) {
      return "Healthy Weight";
    } else if (bmi >= 25 && bmi < 30) {
      return "Overweight";
    } else {
      return "Obese";
    }
  }

  public static void displayBMITable(String name, double bmi, int[] range) {
    System.out.println("-------------------------------------------------------");
    System.out.println("|  WEIGHT     |  BMI        |  WEIGHT STATUS          |");
    System.out.println("-------------------------------------------------------");
    
  }

  public static double[] createWeightAry(double targetWeight, double low, double high) {
    int numEntries = (int)((high - low)/5.5) + 2;
    double[] weightAry = new double[numEntries];
    int i = 0;
    while(low < targetWeight) {
      weightAry[i] = low;
      low += 5.5;
      i++;
    }
    weightAry[i] = targetWeight;
    while(low < high) {
      weightAry[i] = low;
      low += 5.5;
      i++;
    }
    weightAry[i] = high;
    return weightAry;
  }

  // public static double[] createBMIAry(double[] weightAry, int height) {
  //   double[] bmiAry = new double[weightAry.length];
  //   for (int i = 0; i < weightAry.length; i++) {
  //     bmiAry[i] = calculateBMI(weightAry[i], height);
  //   }
  //   return bmiAry;
  // }

  // public static String[] createStatusAry(double[] bmiAry) {
  //   String[] statusAry = new String[bmiAry.length];
  //   for (int i = 0; i < bmiAry.length; i++) {
  //     if (i == 0) {
  //       statusAry[i] = getBMIStatus(bmiAry[i]) + "\t(LOW)";
  //     } else if ( i == bmiAry.length + 1) {
  //       statusAry[i] = getBMIStatus(bmiAry[i]) + "\t(HIGH)";
  //     } else {
  //       statusAry[i] = getBMIStatus(bmiAry[i]);
  //     }
  //   }
  //   return statusAry;
  // }

  public static void displaySummary(String name, double bmi, String status) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
    String dateText = now.format(dateFormatter);
    String timeText = now.format(timeFormatter);
    System.out.printf("\n-- SUMMARY REPORT for %s\n", name.toUpperCase());
    System.out.printf("-- Date and Time:\t%s at %s\n", dateText, timeText);
    System.out.printf("-- BMI:\t\t\t%f (or %.1f if rounded)\n", bmi, bmi);
    System.out.printf("-- Weight Status:\t%s\n\n", status);
    System.out.printf("The SFSU Mashouf Wellness Center is at %s\n", mashoufAddress);
  }

  public static void displayExitMessage(String name) {
    System.out.println("\n--------------------------------------------------------------------------------------------");
    System.out.printf("-- Thank you for using my program, %s!\n", name);
    System.out.println("--------------------------------------------------------------------------------------------\n");
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    displayWelcomeMessage();
    String username = promptAndGetUsername(input);
    int height = promptAndGetHeightInches(input, username);
    double weight = promptAndGetWeightPounds(input, username);
    double bmi = calculateBMI(weight, height);
    displaySummary(username, bmi, getBMIStatus(bmi));
    displayExitMessage(username);
    input.close();
  }

  

  class BMIStatus {

    double weight;
    int height;
    double bmi;
    status status;

    BMIStatus(double weight, int height) {
      this.weight = weight;
      this.height = height;
      this.bmi = calculateBMI(weight, height);
      this.status = getBMIStatus(this.bmi);
    }

    status getBMIStatus(double bmi) {
      if (bmi < 18.5) {
        return status.UNDERWEIGHT;
      } else if (bmi >= 18.5 && bmi < 25) {
        return status.HEALTHY;
      } else if (bmi >= 25 && bmi < 30) {
        return status.OVERWEIGHT;
      } else {
        return status.OBESE;
      }
    }

    double calculateBMI(double weight, int height) {
      return (weight / (height * height)) * 703;
    }
  }
}