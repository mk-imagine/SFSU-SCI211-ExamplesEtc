import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BMICalculator {
  private static final String mashoufAddress = "755 Font Blvd.";
  private static final String ANSI_YELLOW = "\u001B[30;43m";
  private static final String ANSI_RESET = "\u001B[0m";

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

  public static double[] promptAndGetWeightRange(Scanner input, String name, double targetWeight) {
    input.reset();
    double[] range = new double[2];
    do {
      System.out.printf("Please enter a LOW weight in pounds for %s: ", name);
      range[0] = input.nextDouble();
      System.out.printf("Please enter a HIGH weight in pounds for %s: ", name);
      range[1] = input.nextDouble();
      if (targetWeight < range[0] || targetWeight > range[1]) {
        System.out.println("Invalid weight range. Please ensure that your weight is within the weight range.");
      }
    } while (targetWeight < range[0] || targetWeight > range[1]);
    return range;
  }

  public static void printBMITable(String name, BMIStatus[] bmiStatus) {
    System.out.println("\n-------------------------------------------------------");
    System.out.println("|  WEIGHT     |  BMI        |  WEIGHT STATUS          |");
    System.out.println("-------------------------------------------------------");
    for (int i = 0; i < bmiStatus.length; i++) {
      printBMILine(bmiStatus[i], bmiStatus.length, i);
    }
    System.out.println("-------------------------------------------------------\n");
  }

  public static void printBMILine(BMIStatus bmiStatus, int size, int index) {
    switch (bmiStatus.status) {
      case "Underweight":
        if (index == 0) {
          if (bmiStatus.isUser) {
            System.out.printf("| %-11.2f | %-11.2f | Underweight (self)" + ANSI_YELLOW + "(LOW)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi);
          } else {
            System.out.printf("| %-11.2f | %-11.2f | %-17s " + ANSI_YELLOW + "(LOW)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          }
        } else if (index == size - 1) {
          if (bmiStatus.isUser) {
            System.out.printf("| %-11.2f | %-11.2f | Underweight(self)" + ANSI_YELLOW + "(HIGH)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          } else {
            System.out.printf("| %-11.2f | %-11.2f | %-16s " + ANSI_YELLOW + "(HIGH)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          }
        } else {
          if (bmiStatus.isUser) {
            System.out.printf("| %-11.2f | %-11.2f | Underweight (self)     " + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          } else {
            System.out.printf("| %-11.2f | %-11.2f | %-23s |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          }
        }
        break;
      case "Healthy Weight":
        if (index == 0) {
          if (bmiStatus.isUser) {
            System.out.printf("| %-11.2f | %-11.3f | Healthy Weig(self)" + ANSI_YELLOW + "(LOW)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi);
          } else {
            System.out.printf("| %-11.2f | %-11.3f | %-17s " + ANSI_YELLOW + "(LOW)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          }
        } else if (index == size - 1) {
          if (bmiStatus.isUser) {
            System.out.printf("| %-11.2f | %-11.3f | Healthy Wei(self)" + ANSI_YELLOW + "(HIGH)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          } else {
            System.out.printf("| %-11.2f | %-11.3f | %-16s " + ANSI_YELLOW + "(HIGH)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          }
        } else {
          if (bmiStatus.isUser) {
            System.out.printf("| %-11.2f | %-11.3f | Healthy Weight (self)  " + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          } else {
            System.out.printf("| %-11.2f | %-11.3f | %-23s |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          }
        }
        break;
      case "Overweight":
        if (index == 0) {
          if (bmiStatus.isUser) {
            System.out.printf("| %-11.2f | %-11.4f | Overweight (self) " + ANSI_YELLOW + "(LOW)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi);
          } else {
            System.out.printf("| %-11.2f | %-11.4f | %-17s " + ANSI_YELLOW + "(LOW)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          }
        } else if (index == size - 1) {
          if (bmiStatus.isUser) {
            System.out.printf("| %-11.2f | %-11.4f | Overweight (self)" + ANSI_YELLOW + "(HIGH)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          } else {
            System.out.printf("| %-11.2f | %-11.4f | %-16s " + ANSI_YELLOW + "(HIGH)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          }
        } else {
          if (bmiStatus.isUser) {
            System.out.printf("| %-11.2f | %-11.4f | Overweight (self)      " + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          } else {
            System.out.printf("| %-11.2f | %-11.4f | %-23s |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          }
        }
        break;
      case "Obese":
        if (index == 0) {
          if (bmiStatus.isUser) {
            System.out.printf("| %-11.2f | %-11.5f | Obese (self)      " + ANSI_YELLOW + "(LOW)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi);
          } else {
            System.out.printf("| %-11.2f | %-11.5f | %-17s " + ANSI_YELLOW + "(LOW)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          }
        } else if (index == size - 1) {
          if (bmiStatus.isUser) {
            System.out.printf("| %-11.2f | %-11.5f | Obese (self)     " + ANSI_YELLOW + "(HIGH)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          } else {
            System.out.printf("| %-11.2f | %-11.5f | %-16s " + ANSI_YELLOW + "(HIGH)" + ANSI_RESET + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          }
        } else {
          if (bmiStatus.isUser) {
            System.out.printf("| %-11.2f | %-11.5f | Obese (self)           " + " |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          } else {
            System.out.printf("| %-11.2f | %-11.5f | %-23s |\n", 
              bmiStatus.weight, bmiStatus.bmi, bmiStatus.status);
          }
        }
        break;
    }
  }

  public static BMIStatus[] generateBMIArray(double targetWeight, int height, double low, double high) {
    int numEntries = (int)((high - low)/5.5) + 3;
    BMIStatus[] bmiAry = new BMIStatus[numEntries];
    int i = 0;
    while(low < targetWeight) {
      bmiAry[i] = new BMIStatus(low, height, false);
      low += 5.5;
      i++;
    }
    bmiAry[i] = new BMIStatus(low, height, true);
    i++;
    while(low < high) {
      bmiAry[i] = new BMIStatus(low, height, false);
      low += 5.5;
      i++;
    }
    bmiAry[i] = new BMIStatus(high, height, false);
    return bmiAry;
  }

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
  }

  public static void displayExitMessage(String name) {
    System.out.printf("The SFSU Mashouf Wellness Center is at %s\n\n", mashoufAddress);
    System.out.println("--------------------------------------------------------------------------------------------");
    System.out.printf("-- Thank you for using my program, %s!\n", name);
    System.out.println("--------------------------------------------------------------------------------------------\n");
  }

  public static void run() {
    Scanner input = new Scanner(System.in);
    displayWelcomeMessage();
    String username = promptAndGetUsername(input);
    int height = promptAndGetHeightInches(input, username);
    double weight = promptAndGetWeightPounds(input, username);
    BMIStatus userStatus = new BMIStatus(weight, height, true);
    displaySummary(username, userStatus.bmi, userStatus.status);
    double[] weightRange = promptAndGetWeightRange(input, username, weight);
    BMIStatus[] bmiArray = generateBMIArray(weight, height, weightRange[0], weightRange[1]);
    printBMITable(username, bmiArray);
    displayExitMessage(username);
    input.close();
  }

  static class BMIStatus {
    double weight;
    double bmi;
    String status;
    boolean isUser;
  
    BMIStatus(double weight, int height, boolean isUser) {
      this.weight = weight;
      this.bmi = calculateBMI(weight, height);
      this.status = getBMIStatus(this.bmi);
      this.isUser = isUser;
    }
  
    String getBMIStatus(double bmi) {
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
  
    double calculateBMI(double weight, int height) {
      return (weight / (height * height)) * 703;
    }
  }

  public static void main(String[] args) {
    run();
  }
}