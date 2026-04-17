import java.util.Arrays;
import java.util.Scanner;

public class UC20 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management - UC20 ===");

        String[] bogieIds = {};

        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        Arrays.sort(bogieIds);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        System.out.println("Bogie Found: " + found);
    }
}
