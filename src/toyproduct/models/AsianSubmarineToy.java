package toyproduct.models;
import toyproduct.Toy;
import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import toyproduct.components.Engine;

public class AsianSubmarineToy implements Toy {
    final private Integer serialNumber;
    final String type = "submarine";
    final ComponentFactory factory;
    private Engine engine;
    public AsianSubmarineToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AsianComponentFactory();
    }
    @Override
    public Integer getSerialNumber() {
        return this.serialNumber;
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
        return "AsianSubmarineToy{" + "serialNumber=" + serialNumber + '}';
    }
    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
    }
}