import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter a number : ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter a number : ");
        int num3 = scanner.nextInt();
        
              if (num1 <= num2 && num2 <= num3) {
            System.out.println("Numbers in ascending order: " + num1 + " " + num2 + " " + num3);
        } else {

            if (num1 >= num2 && num1 >= num3) {
                if (num2 >= num3) {
                    System.out.println("Numbers in descending order: " + num1 + " " + num2 + " " + num3);
                } else {
                    System.out.println("Numbers in descending order: " + num1 + " " + num3 + " " + num2);
                }
            } else if (num2 >= num1 && num2 >= num3) {
                if (num1 >= num3) {
                    System.out.println("Numbers in descending order: " + num2 + " " + num1 + " " + num3);
                } else {
                    System.out.println("Numbers in descending order: " + num2 + " " + num3 + " " + num1);
                }
            } else {
                if (num1 >= num2) {
                    System.out.println("Numbers in descending order: " + num3 + " " + num1 + " " + num2);
                } else {
                    System.out.println("Numbers in descending order: " + num3 + " " + num2 + " " + num1);
                }
            }
        }
                scanner.close();
    }
}
