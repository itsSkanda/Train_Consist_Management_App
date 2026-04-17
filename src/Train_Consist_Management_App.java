import java.util.LinkedHashSet;

public class UC5 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management - UC5 ===");

        LinkedHashSet<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");

        System.out.println(formation);
    }
}
