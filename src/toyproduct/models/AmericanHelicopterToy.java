package toyproduct.models;
import toyproduct.Toy;
import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproduct.components.Engine;
import toyproduct.components.RotorBlade;

public class AmericanHelicopterToy implements Toy{
    final private Integer serialNumber;
    final String type = "helicopter";
    final ComponentFactory factory;
    private Engine engine;
    private RotorBlade rotorBlade;
    public AmericanHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AmericanComponentFactory();
    }
    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    public String getType() {
        return type;
    }
    @Override
    public void pack() {
        System.out.printf("Packing '%s' '%d'\n", this.type, this.serialNumber);
        }
    @Override
    public void label() {
        System.out.printf("Labelling '%s''%d'\n", this.type,  this.serialNumber);
    }
    @Override 
    public String toString() {
        return "HelicopterToy(" + "serialNumber=" + serialNumber + ')';
    }
    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        this.rotorBlade = this.factory.createRotorBlade();
    }
}