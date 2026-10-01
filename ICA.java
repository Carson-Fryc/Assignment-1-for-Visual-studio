// Name: Carson Fryc
// GitHub username: your-username

// Scanner import goes here (see your cheat sheet).

import java.util.Scanner;

public class ICA {
    public static void main(String[] args) {

        // Scanner setup goes here.
        Scanner scanner = new Scanner(System.in);

        // ==================== Part 1: Output and Variables (2 pts) ====================
        // - Declare a product name (String), number in stock (int), and number on
        //   order (int).
        // - In ONE print or println using +, print the name and the total units
        //   (stock + on order), added up by your code.

        

        // Example (Widget, 52 in stock, 5 on order):
        //   Widget: 57 units
        {
            String productName = "Heaters";
            int amountStock = 20;
            int ordered = 3;

            System.out.println("The product is " + productName + ", there's " + amountStock + " in stock and " + ordered + " have been ordered");
        }

        // ==================== Part 2: Relational Operators (6 pts) ====================
        // Store each result in a boolean using the operator (don't type true or
        // false, and don't use if/else). Print each with its own print statement,
        // showing both numbers, the operator, and the result.
        // - Declare two ints, firstNumber and secondNumber, with different values.
        // - firstNumber > secondNumber
        // - firstNumber < secondNumber
        // - firstNumber >= secondNumber
        // - firstNumber == secondNumber
        // - firstNumber != secondNumber
        //
        // Example (4 and 9):
        //   4 > 9: false
        //   4 < 9: true
        //   ...
        {
            Double num1 = 3.4;
            Double num2 = 9.8;
            System.out.println(num1 > num2);
        }

        // ==================== Part 3: Input (2 pts) ====================
        // - Ask the user for two exam scores (int).
        // - Print each score with a label, one print statement each.
        //
        // Example (78 and 91):
        //   Score 1: 78
        //   Score 2: 91
        {
            System.out.print("Enter your first exam score: ");
            int score1 = scanner.nextInt();
            System.out.print("Enter your second exam score: ");
            int score2 = scanner.nextInt();
            System.out.println("Exam 1: " + score1);
            System.out.println("Exam 2: " + score2);
        }

        // ==================== Part 4: The Input Buffer (3 pts) ====================
        // - Ask the user for their age (int).
        // - Then ask for their favorite quote (full sentence). Age must come first,
        //   and the quote must not get skipped.
        // - Print both with labels.
        //
        // Example (21, "Practice makes progress."):
        //   Age: 21 Favorite quote: Practice makes progress.
        {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter your favorite quote: ");
            String quote = scanner.nextLine();
            System.out.println(age);
            System.out.println(quote);
        }

        // ==================== Part 5: Datatypes and Casting (3 pts) ====================
        // - Assign an int to a double (implicit cast).
        // - Cast a double with a decimal value to an int (explicit cast).
        // - Print all four values with labels, each on its own line, in this order:
        //   original int, int as double, original double, double as int.
        //
        // Example (42 and 7.89):
        //   Original int: 42
        //   Int as double: 42.0
        //   Original double: 7.89
        //   Double as int: 7
        {
            int intValue = 10;
            double doubleValue = intValue;
            double decimalValue = 5.7;
            int castedValue = (int) decimalValue;
            System.out.println("Int value: " + intValue);
            System.out.println("double value (From int): " + doubleValue);
            System.out.println("decimal value: " + decimalValue);
            System.out.println("casted value (from double to int): " + castedValue);


        }

        // ==================== Part 6: printf and Formatting (2 pts) ====================
        // - Declare a drink name (String), price of one drink (double), and
        //   quantity (int). Calculate the total.
        // - Print all four in ONE printf, with a $ and two decimal places on the
        //   price and total.
        //
        // Example (Latte, 3.95, 3):
        //   3 x Latte at $3.95 each = $11.85
        {
            
            double price = 3.00;
            double tax = 1.05;
            double total = price + tax;
            System.out.printf("Price: $%.2f\n", price);
            System.out.printf("Tax: $%.2f\n", tax);
            System.out.printf("Total: $%.2f\n", total);
            String drink = null;
            System.out.println("A " + drink + " costs" + total + ".");
        }

        // ==================== Part 7: Putting It Together (4 pts) ====================
        // - Ask the user for three test scores (int).
        // - Then ask for their name (String). Scores must come first.
        // - Calculate the average as a decimal.
        // - Print the name and average in ONE printf, to two decimal places.
        //
        // Example (85, 90, 93, Sam):
        //   Sam's average: 89.33
        {
            System.out.print("Enter the first test score: ");
            int score1 = scanner.nextInt();
            System.out.print("Enter the second test score: ");
            int score2 = scanner.nextInt();
            System.out.print("Enter the third test score: ");
            int score3 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            double average = (score1 + score2 + score3) / 3.0;
            System.out.printf("Name: %s\n", name);
            System.out.printf("Average: %.2f\n", average);
            
        }

        // Close your Scanner here.
        scanner.close();
    }
}
