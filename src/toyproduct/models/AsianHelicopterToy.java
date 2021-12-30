package toyproduct.models;
import toyproduct.Toy;
import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import toyproduct.components.Engine;
import toyproduct.components.RotorBlade;

public class AsianHelicopterToy implements Toy{
    final private Integer serialNumber;
    final String type = "helicopter";
    final ComponentFactory factory;
    private Engine engine;
    private RotorBlade rotorBlade;
    public AsianHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AsianComponentFactory();
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
        return "CarToy(" + "serialNumber=" + serialNumber + ')';
    }
    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        this.rotorBlade = this.factory.createRotorBlade();
    }
}