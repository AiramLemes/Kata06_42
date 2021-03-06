
package toyproducts.models;

import toyproducts.Toy;


public class AsianHelicopterToy implements Toy{
    
    final Integer serialNumber;
    final String type = "helicopter";

    public AsianHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    

    public String getType() {
        return type;
    }
    
    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    
    @Override
    public void pack() {
        System.out.printf("\nPacking '%s' %d'\n", this.type, this.serialNumber);
    }
    
    @Override
    public void label() {
        System.out.printf("Labelling '%s' %d'\n", this.type, this.serialNumber);
    }

    @Override
    public String toString() {
        return "AsianHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }

    
    
}
