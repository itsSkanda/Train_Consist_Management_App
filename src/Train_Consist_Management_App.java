import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC11 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management - UC11 ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        System.out.println("Train ID Valid: " + trainMatcher.matches());
        System.out.println("Cargo Code Valid: " + cargoMatcher.matches());
    }
}
