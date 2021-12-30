package kata6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;
import business.SerialNumberGenerator;
import toyproduct.Toy;
import branches.AmericanToyBusiness;
import branches.AsianToyBusiness;
import business.SerialNumberGenerator;
import business.ToyBusiness;

public class Kata6 {
    
    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String line = "";
        ToyBusiness business = new AmericanToyBusiness();

        while(!line.equals("exit")) {
            line = input.nextLine();
            switch (line) {
                case "car":
                case "helicopter":
                    toys.add(business.createToy(line));
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
