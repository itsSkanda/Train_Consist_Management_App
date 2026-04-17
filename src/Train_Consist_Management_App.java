import java.util.LinkedList;

public class UC4 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management - UC4 ===");

        LinkedList<String> consist = new LinkedList<>();

        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        consist.add(2, "Pantry");

        consist.removeFirst();
        consist.removeLast();

        System.out.println(consist);
    }
}
