import java.util.Scanner;

public class IT24104087Lab3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        double othrs = sc.nextDouble(); 
        System.out.print("Enter the number OT hourly rate: ");
        double otrate = sc.nextDouble();

        double otsalary = otrate*othrs  ; 

        double totalsalary = salary+otsalary;
        
        
        System.out.print("Total salary including OT is : "+totalsalary  );
        


    }
}

      
    