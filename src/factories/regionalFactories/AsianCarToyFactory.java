
package factories.regionalFactories;

import business.ToyBusiness;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.*;


public class AsianCarToyFactory extends ToyFactory {
    
    
    @Override
    
    public Toy createToy(Integer serialNumber) {
   
        return new AsianCarToy(serialNumber);


           
    }
}
