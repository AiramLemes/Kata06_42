
package factories.regionalFactories;


import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.*;


public class AmericanCarToyFactory extends ToyFactory {
    
    
    @Override
    
    public Toy createToy(Integer serialNumber) {
      
        return new AmericanCarToy(serialNumber);



    }
}
