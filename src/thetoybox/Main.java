
package thetoybox;
import branches.AmericanToyBusiness;
import business.ToyBusiness;
import toyproducts.models.AmericanHelicopterToy;
import toyproducts.models.AmericanCarToy;
import java.util.*;
import java.util.stream.Collectors;
import toyproducts.Toy;
import toys.*;

public class Main {

    
    public static void main(String[] args) {
        
        ToyBusiness business = new AmericanToyBusiness();
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Toy> toys = new ArrayList<>();
        
        String input = "";
        
        
        while (!input.equals("exit")) {
            input = scanner.next();
            
            switch (input) {
                
                case "car": 
                case "helicopter":
                    
                    toys.add(business.createToy(input));
                    System.out.println("Built Toys: " + toys.stream()
                                        .map(c -> c.toString())
                                        .collect(Collectors.joining(", ")));
                    break;
                    
                    
                case "exit":
                    System.out.println("Exiting ...");
                    break;
                    
                default:
                    
                    System.out.println("Command unknown!\n");
                    break;
            
            
            
            }
        
        
        }

    }
    
}
