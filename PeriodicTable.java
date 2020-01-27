import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Set<String> chemicals = new TreeSet<>();

        for (int i = 0; i < count; i++) {
            String[] currentChemical = scanner.nextLine().split("\\s+");
            for (int j = 0; j < currentChemical.length; j++) {
                chemicals.add(currentChemical[j]);
            }
        }

        for (String chemical : chemicals) {
            System.out.print(chemical + " ");
        }

    }
}
