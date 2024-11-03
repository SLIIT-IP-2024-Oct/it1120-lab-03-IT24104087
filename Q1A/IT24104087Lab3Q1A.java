import java.util.Scanner;

public class IT24104087Lab3Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of 1 kg: ");
        double price1kg = sc.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        double quantityKg = sc.nextDouble(); 
        
        double FinalPrice = price1kg*quantityKg;


        
        System.out.print("Price is : "+ FinalPrice);
        


    }
}

      
    