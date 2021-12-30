package factories.regionalfactories;
import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;

public class AmericanToyFactory extends ToyFactory {
    @Override
    public Toy createToy(String type) {
        switch (type) {
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