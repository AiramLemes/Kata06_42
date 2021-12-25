
package toys;


public class Helicopter {
    
    final Integer serialNumber;
    final String type = "helicopter";

    public Helicopter(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    

    public String getType() {
        return type;
    }
    
    
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    
    
    public void pack() {
        System.out.printf("\nPacking '%s' %d'\n", this.type, this.serialNumber);
    }
    
    
    public void label() {
        System.out.printf("Packing '%s' %d'\n", this.type, this.serialNumber);
    }

    
    
}
