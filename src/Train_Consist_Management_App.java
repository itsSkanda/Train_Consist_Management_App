import java.util.ArrayList;

public class UC2 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management - UC2 ===");

        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println(passengerBogies);

        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println(exists);

        System.out.println(passengerBogies);
    }
}
