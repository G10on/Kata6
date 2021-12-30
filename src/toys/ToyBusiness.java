package toys;

public class ToyBusiness {
    SerialNumberGenerator generator = new SerialNumberGenerator();
    public Car createCar() {
        Car car = new Car(this.generator.next());
        car.pack();
        car.label();
        return car;
    }
    public Helicopter createHelicopter() {
        Helicopter helicopter = new Helicopter(this.generator.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;
    }
}