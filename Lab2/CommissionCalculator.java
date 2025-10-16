import java.util.*;

public class CommissionCalculator {
    public void run(){
       // Create and set an Auto policy object setting data using constructor
       Auto a = new Auto("Jerry", "Seinfed", "Chevy", "Malibu", 10000.0, 50000.0);

       // Compute commission
       a.computeCommission();

       // Print auto policy
       System.out.println(a);
      
       // Create and set a Home policy object setting data using constructor
       Home h = new Home("Elaine", "Benes", 4000, 32000, 5000, 10000);

       // Compute commission
       h.computeCommission();

       // Print home policy
       System.out.println(h);

       // Create and set an Life policy object setting data using constructor
       Life l = new Life("Cosmo", "Kramer", 35, 50000);

       // Compute commission
       l.computeCommission();

       // Print life policy
       System.out.println(l);

       // Test getters
       System.out.println("Get life firstName: " + l.getFirstName());
       System.out.println("Get life lastName: " + l.getLastName());
       System.out.println("Get life age: " + l.getAge());
       System.out.println("Get life term: " + l.getTerm());
    }
    
    public static void main(String[] args){
        CommissionCalculator calc = new CommissionCalculator();
        calc.run();
    }
}
