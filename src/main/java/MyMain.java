import java.util.Scanner;

public class MyMain {
    
    
    public static int binaryToDecimal(String binary) { 
        // Convert String to integer
        int bin = Integer.parseInt(binary);
        
        // Create a variable to store the decimal value 
        int dec = 0;
        // Create a base variable, which will increase as we go along
        int base = 1;
        
        // Loop through the binary number
        while (bin >= 1)
        {
            // Find the last digit and update dec appropriately
            int lastDigit = bin % 10;
            dec += lastDigit * base;
            
            // Update bin and base
            bin /= 10;
            base *= 2;
        }
        
        return dec;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // YOUR CODE HERE
        System.out.println("Type in a number in binary format: ");
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(scan.next()));

        scan.close();
    }
}
