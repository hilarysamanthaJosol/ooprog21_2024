import java.util.Scanner;

public class CarlysEventPrice 
{
    public static void main(String[] args) 
    {
        final int Price = 35;

        Scanner input = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("* Carly's makes the food that makes   *" );
        System.out.println("*           it a party.                *");
        System.out.println("****************************************");
        
        System.out.print("Indicate how many people are coming to the event: ");
        int NumberOfGuests = input.nextInt();
        int TotalPrice = NumberOfGuests * Price;

        System.out.println("Number of Guests: " + NumberOfGuests);
        System.out.println("Price per Guest: $" + Price);
        System.out.println("Total Price: $" + TotalPrice);
        
        if(NumberOfGuests >= 50){
          System.out.println("Is it a large event? True");
       }
       else
       {
          System.out.println("Is this a large event? False");  
        }
    }
}
