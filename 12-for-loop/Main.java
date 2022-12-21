
// ------------------ 1. Java For Loop --------------------
// public class Main {
// public static void main(String args[]) {
// for (int i = 0; i < 5; i++) {
// System.out.println(i);
// }
// }
// }

// -------------------- 2. Nested Loops --------------------
public class Main {
    public static void main(String args[]) {
        // outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("outer: " + i);

            // Inner loop
            for (int j = 0; j <= 3; j++) {
                System.out.println(" Inner: " + j);
            }
        }
    }
}