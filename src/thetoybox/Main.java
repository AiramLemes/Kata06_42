
package thetoybox;
import java.util.*;
import java.util.stream.Collectors;
import toys.*;

public class Main {

    
    public static void main(String[] args) {
        
        SerialNumberGenerator serial = new SerialNumberGenerator();
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        
        String input = "";
        
        
        while (!input.equals("exit")) {
            input = scanner.next();
            
            switch (input) {
                
                case "car": 
                    Car car = new Car(serial.next());
                    car.pack();
                    car.label();
                    cars.add(car);
                    System.out.println("Built Cars: " + cars.stream()
                                        .map(c -> c.getSerialNumber().toString())
                                        .collect(Collectors.joining(", ")));
                    break;
                    
                
                case "helicopter":
                    Helicopter helicopter = new Helicopter(serial.next());
                    helicopter.pack();
                    helicopter.label();
                    helicopters.add(helicopter);
                    System.out.println("Built Helicopters: " + helicopters.stream()
                                        .map(c -> c.getSerialNumber().toString())
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
