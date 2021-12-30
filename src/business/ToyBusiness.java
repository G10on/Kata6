package business;
import toyproduct.Toy;

public abstract class ToyBusiness {
    final public SerialNumberGenerator generator = new SerialNumberGenerator();
    public abstract Toy createToy(String type);
}