package factories.regionalfactories;
import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AsianCarToy;
import toyproduct.models.AsianHelicopterToy;

public class AsianToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
        switch (type) {
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