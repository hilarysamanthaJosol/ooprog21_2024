import java.util.Scanner;

public class SammysRentalPrice 
{
    public static void main(String[] args) 
    {
         final int HourlyRate = 40;
         final int  AdditionalMinutesRate = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.print("Enter the amount of time that was rented: ");
        
        int totalMinutes = input.nextInt();
        int Hours = totalMinutes / 60;    
        int additionalMinutes = totalMinutes % 60;

        double totalPrice;
        
        if (totalMinutes < 60) {
            totalPrice = HourlyRate;
        } else {
            totalPrice = (Hours * HourlyRate) + (additionalMinutes * AdditionalMinutesRate);
        }
        System.out.println("-------------------------------------\n");
        System.out.println("Number of Minutes: " + totalMinutes);
        System.out.println("Hours: " + Hours);
        
        if(totalMinutes < 60){
             System.out.println("Additional Minutes: 0");
        } else {
             System.out.println("Additional Minutes: " + additionalMinutes);
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}
