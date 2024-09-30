import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaterialCutting {

    private static final int BAR_LENGTH = 6000; // Lungimea unei bare
    private static final int BLADE_THICKNESS = 1; // Grosimea panzei fierastraului

    // Functie pentru optimizarea taierii
    public static void optimizeCutting(List<Integer> cuts) {
        Collections.sort(cuts, Collections.reverseOrder()); // Sortam descrescator
        List<List<Integer>> bestCutsOrder = new ArrayList<>(); // Ordinea bucatilor
        List<Integer> remains = new ArrayList<>(); // Lista resturilor
        int totalWaste = 0; // Totalul restului

        // Incepem taierea
        for (int cut : cuts) {
            int effectiveCut = cut + BLADE_THICKNESS; // Ajustam taietura pentru grosimea panzei
            boolean cutMade = false;

            for (int i = 0; i < remains.size(); i++) {
                if (remains.get(i) >= effectiveCut) { // Verificam daca putem taia din resturi existente
                    remains.set(i, remains.get(i) - effectiveCut); // Taiem din restul respectiv
                    if (bestCutsOrder.size() <= i) {
                        bestCutsOrder.add(new ArrayList<>());
                    }
                    bestCutsOrder.get(i).add(cut); // Adaugam taietura in ordinea curenta
                    cutMade = true; // Taierea a fost facuta
                    break;
                }
            }

            // Daca nu putem taia din resturi, folosim o bara noua
            if (!cutMade) {
                remains.add(BAR_LENGTH - effectiveCut); // Adaugam restul
                List<Integer> newOrder = new ArrayList<>();
                newOrder.add(cut);
                bestCutsOrder.add(newOrder);
            }
        }

        // Calculam restul total
        for (int remain : remains) {
            totalWaste += remain;
        }

        // Afisam solutia optima
        printSolution(bestCutsOrder, remains, totalWaste);
    }

    // Functie pentru afisarea celei mai bune solutii
    private static void printSolution(List<List<Integer>> bestCutsOrder, List<Integer> remains, int totalWaste) {
        System.out.println("Cea mai buna solutie de taiere:");
        for (int i = 0; i < bestCutsOrder.size(); i++) {
            System.out.print("Teava " + (i + 1) + ": ");
            for (int cut : bestCutsOrder.get(i)) {
                System.out.print(cut + ", ");
            }
            System.out.println();
            // Afisam restul
            int rest = remains.get(i);
            System.out.println("Rest din Teava " + (i + 1) + ": " + rest + " mm");
        }
        System.out.println("Rest total: " + totalWaste + " mm");
        System.out.println("Total tevi necesare: " + bestCutsOrder.size()); // Afișăm totalul de tevi
    }

    // Functie pentru a introduce dimensiunile
    private static List<Integer> inputCuts() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> cuts = new ArrayList<>();

        System.out.println("Introduceti dimensiunile si numarul de bucati pe un singur rand:");
        System.out.println("Format: dimensiune1 numar_bucati1 dimensiune2 numar_bucati2 ...");

        String input = scanner.nextLine(); // Citim linia completa
        String[] parts = input.split(" "); // Spargem inputul in bucati

        // Verificam daca inputul contine un numar par de elemente
        if (parts.length % 2 != 0) {
            System.out.println("Introduceti dimensiuni si numarul de bucati corect.");
            return cuts; // Returnam lista goala
        }

        for (int i = 0; i < parts.length; i += 2) {
            try {
                int dimensiune = Integer.parseInt(parts[i]);
                int bucati = Integer.parseInt(parts[i + 1]);

                if (dimensiune <= 0 || bucati <= 0) {
                    System.out.println("Atat dimensiunea cat si numarul de bucati trebuie sa fie mai mari decat 0.");
                    return cuts; // Returnam lista goala
                }

                // Adaugam dimensiunile
                for (int j = 0; j < bucati; j++) {
                    cuts.add(dimensiune);
                }
            } catch (NumberFormatException e) {
                System.out.println("Te rog introdu un numar valid pentru dimensiune si numar de bucati.");
                return cuts; // Returnam lista goala
            }
        }

        return cuts;
    }

    public static void main(String[] args) {
        List<Integer> cuts = inputCuts(); // Apelam functia de introducere a dimensiunilor

        if (!cuts.isEmpty()) { // Verificam daca exista taieturi
            optimizeCutting(cuts); // Apelam functia de optimizare
        } else {
            System.out.println("Nu au fost introduse dimensiuni pentru taiere.");
        }
    }
}
