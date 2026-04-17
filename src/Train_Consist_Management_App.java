import java.util.Scanner;

public class UC18 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management - UC18 ===");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

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
