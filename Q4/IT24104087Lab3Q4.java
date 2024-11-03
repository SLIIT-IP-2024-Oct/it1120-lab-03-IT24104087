import java.util.Scanner;

public class IT24104087Lab3Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 5 digit number : ");
        int amount = sc.nextInt();
        
        
        int digit1 = amount / 10000;
        amount %= 10000;
        
        int digit2 = amount / 1000;
        amount %= 1000;

        int digit3 = amount / 100;
        amount %= 100;

        int digit4 = amount / 10;
        amount %= 10;

        int digit5 = amount; 
        
        System.out.print(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
      


        
        sc.close();

        
        
    }
}

        


    