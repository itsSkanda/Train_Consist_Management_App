import java.util.Arrays;
import java.util.Scanner;

public class UC19 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management - UC19 ===");

        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        Arrays.sort(bogieIds);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Bogie Found: " + found);
    }
}
