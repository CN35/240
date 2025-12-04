import java.util.*;
public class Policy {
  static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
      System.out.println("-----------------------------\nWelcome to Parkland Insurance\n-----------------------------\nEnter any of the following in STDIN box:\n1) Enter auto insurance policy information\n2) Enter home insurance policy information\n3) Enter life insurance policy information\n4) Compute commission and print auto policy\n5) Compute commission and print home policy\n6) Compute commission and print life policy\n7) Quit");
      int m = input.nextInt();switch (m){
      case 1:
        System.out.println("First name of insured: ");String first1 = input.nextLine(); 
        System.out.println("Last name of insured: ");String last1 = input.nextLine(); 
        System.out.println("Make of vehicle: ");String make1 = input.nextLine(); 
        System.out.println("Model of vehicle: ");String vehicle1 = input.nextLine(); 
        System.out.println("Amount of liability: ");int liability1 = input.nextInt();
        System.out.println("Amount of collision: ");int collision1 = input.nextInt();
        break;
      case 2:
        System.out.println("First name of insured: ");String first2 = input.nextLine(); 
        System.out.println("Last name of insured: ");String last2 = input.nextLine(); 
        System.out.println("house square footage: ");int footage2 = input.nextInt();
        System.out.println("Amount of dwelling: $");int dwelling2 = input.nextInt();
        System.out.println("Amount of contents: $");int contents2 = input.nextInt();
        System.out.println("Amount of liability: $");int liability2 = input.nextInt();
        break;
      case 3:
        System.out.println("First name of insured: ");String first3 = input.nextLine(); 
        System.out.println("Last name of insured: ");String last3 = input.nextLine(); 
        System.out.println("Age of insured: ");int age3 = input.nextInt();
        System.out.println("Term: ");int term3 = input.nextInt();
        break;
      case 4:
        System.out.println("Name: ");String name4 = input.nextLine(); 
        System.out.println("Make: ");String make4 = input.nextLine(); 
        System.out.println("Model: ");String model4 = input.nextLine(); 
        System.out.println("Liability: $");int liability4 = input.nextInt();
        System.out.println("Collision: $");int collision4 = input.nextInt();
        System.out.println("Commission: $");int commission4 = input.nextInt();
        break;
      case 5:
        System.out.println("Name: ");String name5 = input.nextLine(); 
        System.out.println("Footage: ");int footage5 = input.nextInt();
        System.out.println("Dwelling: $");int dwelling5 = input.nextInt();
        System.out.println("Contents: $");int contents5 = input.nextInt();
        System.out.println("Liability: $");int liability5 = input.nextInt();
        System.out.println("Commission: ");int commission5 = input.nextInt();
        break;
      case 6:
        System.out.println("Name: ");String name6 = input.nextLine();
        System.out.println("Age: ");int age6 = input.nextInt();
        System.out.println("Term: ");int term6 = input.nextInt();
        System.out.println("Commission: $");int commission6 = input.nextInt();
        break;
      case 7:break;}
               // Create commission calculator
            
             CommissionCalculator calc = new CommissionCalculator();
            
            
            
             // Run commission calculator
            
             calc.run();
      }
    

}
