
package toys;


public class SerialNumberGenerator {
    
    private int serialNumber;

    
    public SerialNumberGenerator() {
        
        this.serialNumber = 0;
    }
    
    public int next() {
        this.serialNumber++;
        return serialNumber;
    }
    
    
}
