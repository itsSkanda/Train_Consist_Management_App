import java.util.Arrays;

public class UC17 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management - UC17 ===");

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        Arrays.sort(bogieNames);

        System.out.println(Arrays.toString(bogieNames));
    }
}
