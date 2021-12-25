
package thetoybox;
import java.util.*;
import toys.*;

public class Main {

    
    public static void main(String[] args) {
        
        SerialNumberGenerator serial = new SerialNumberGenerator();
        
        Scanner scanner = new Scanner(System.in);
        
        
        if (scanner.next() == "exit") {
            System.exit(0);
        }

        Car coche = new Car(serial.next());
        coche.pack();
        coche.label(); 
        
        
    }

    public Main() {
    }
    
}
