
package business;

import toyproducts.models.AmericanHelicopterToy;
import toyproducts.models.AmericanCarToy;
import java.util.stream.Collectors;
import toyproducts.Toy;
import factories.SerialNumberGenerator;
import factories.ToyFactory;

public class ToyBusiness {
    
    private final ToyFactory toyFactory;
    

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }
    
    
    public Toy createToy(String type) {
        return this.toyFactory.produceToy(type);
    }
    
}
