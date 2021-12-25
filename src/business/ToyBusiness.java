
package business;

import toyproducts.models.AmericanHelicopterToy;
import toyproducts.models.AmericanCarToy;
import java.util.stream.Collectors;
import toyproducts.Toy;
import toys.SerialNumberGenerator;

public abstract class ToyBusiness {
    final protected SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
    
    public ToyBusiness() {
    }
    
}
