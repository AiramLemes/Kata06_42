
package toyproducts.models;

import toyproducts.Toy;


public class AmericanCarToy implements Toy{
    
    final Integer serialNumber;
    final String type = "car";
    
    public AmericanCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    
    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
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
        return "AmericanCarToy{" + "serialNumber=" + serialNumber + '}';
    }

    
    
}
