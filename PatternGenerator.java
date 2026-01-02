public class PatternGenerator {
    public static void main(String[] args) {

        int n = 5, num;

        // 1. Right Triangle (Stars)
        System.out.println("Right Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Pyramid Pattern
        System.out.println("\nPyramid:");
        for (int i = 1; i <= n; i++) {
            for (int s = n; s > i; s--){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. Number Pattern (1, 12, 123)
        System.out.println("\nNumber Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }

        // 4. Inverted Right Triangle
        System.out.println("\nInverted Triangle:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        // 5. Diamond Pattern
        System.out.println("\nDiamond Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int s = n; s > i; s--)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n; s > i; s--)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }

        // 6. Floyd’s Triangle
        System.out.println("\nFloyd's Triangle:");
        num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(num++ + " ");
            System.out.println();
        }
        // 7. Pascal’s Triangle
        System.out.println("\nPascal's Triangle:");
        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int s = n; s > i; s--)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

