
package thetoybox;

import business.ToyBusiness;
import factories.regionalFactories.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;



public class Main {

    
    public static void main(String[] args) {
        
        ToyBusiness business = new ToyBusiness();
        //ToyBusiness business = new ToyBusiness(new AsianToyFactory());
        business.add("car", new AmericanCarToyFactory());
        business.add("helicopter", new AsianHelicopterToyFactory());
        business.add("submarine", new AmericanSubmarineToyFactory());
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Toy> toys = new ArrayList<>();
        
        String input = "";
        
        
        while (!input.equals("exit")) {
            input = scanner.next();
            
            switch (input) {
                
                case "car": 
                case "helicopter":
                case "submarine":
                    
                    toys.add(business.produceToy(input));
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
