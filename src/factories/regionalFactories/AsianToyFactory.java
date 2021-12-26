
package factories.regionalFactories;

import business.ToyBusiness;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.*;


public class AsianToyFactory extends ToyFactory {
    
    
    @Override
    
    public Toy createToy(String type) {
        switch(type) {

            case "car":
                AsianCarToy car = new AsianCarToy(this.generator.next());
                return car;


            case "helicopter":
                AsianHelicopterToy helicopter = new AsianHelicopterToy(this.generator.next());
                return helicopter;

            default:
                return null;
        }
    }
}
