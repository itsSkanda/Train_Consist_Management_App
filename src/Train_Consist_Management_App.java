import java.util.HashSet;

public class UC3 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management - UC3 ===");

        HashSet<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println(bogieIds);
    }
}
