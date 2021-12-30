package kata6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;
import factories.SerialNumberGenerator;
import toyproduct.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;

public class Kata6 {
    
    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String line = "";
        ToyBusiness business = new ToyBusiness(new AmericanToyFactory());

        while(!line.equals("exit")) {
            line = input.nextLine();
            switch (line) {
                case "car":
                case "helicopter":
                    toys.add(business.produceToy(line));
                    System.out.println("Built toys: " + toys.stream().map(c -> c.toString()).collect(Collectors.joining(", ")));
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
