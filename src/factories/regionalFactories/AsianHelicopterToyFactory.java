
package factories.regionalFactories;

import business.ToyBusiness;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.*;


public class AsianHelicopterToyFactory extends ToyFactory {
    
    
    @Override
    
    public Toy createToy(Integer serialNumber) {
        
        return new AsianHelicopterToy(serialNumber);

           
    }
}
