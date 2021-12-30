package kata6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;
import toys.SerialNumberGenerator;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;

public class Kata6 {
    
    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters= new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = "";

        while(!line.equals("exit")) {
            line = in.nextLine();
            switch (line) {
                case "car": 
                     Car car = new Car(generator.next());
                     car.pack();
                     car.label();
                     cars.add(car);
                     System.out.println("Built cars: "+cars.stream().map(c -> c.getSerialNumber().toString()).collect(Collectors.joining(", ")));
                     break;

                 case "helicopter": 
                     Helicopter helicopter = new Helicopter(generator.next());
                     helicopter.pack();
                     helicopter.label();
                     helicopters.add(helicopter);
                     System.out.println("Built helicopters: "+helicopters.stream().map(c -> c.getSerialNumber().toString()).collect(Collectors.joining(", ")));
                     break;

                 case "exit":
                     System.out.println("Exiting...");
                     break;

                 default:
                     System.out.println("Command not found");
            }
        }
    }
}
