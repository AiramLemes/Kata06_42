
package factories.regionalFactories;


import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.*;


public class AmericanSubmarineToyFactory extends ToyFactory {
    
    
    @Override
    
    public Toy createToy(Integer serialNumber) {
      
        return new AmericanSubmarineToy(serialNumber);



    }
}
