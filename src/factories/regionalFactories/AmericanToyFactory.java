
package factories.regionalFactories;


import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.*;


public class AmericanToyFactory extends ToyFactory {
    
    
    @Override
    
    public Toy createToy(String type) {
        switch(type) {

            case "car":
                AmericanCarToy car = new AmericanCarToy(this.generator.next());
                return car;


            case "helicopter":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(this.generator.next());
                return helicopter;

            default:
                return null;
        }
    }
}
