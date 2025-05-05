public class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 1, 0},
            {1, 3, 2},
            {0, 0, 0},
            {4, 5, 6}
        };

        // Test isNonZeroRow
        System.out.println(ArrayResizer.isNonZeroRow(arr, 0)); // false
        System.out.println(ArrayResizer.isNonZeroRow(arr, 1)); // true
        System.out.println(ArrayResizer.isNonZeroRow(arr, 2)); // false
        System.out.println(ArrayResizer.isNonZeroRow(arr, 3)); // true

        // Test resize
        int[][] smaller = ArrayResizer.resize(arr);
        System.out.println("Resized array:");
        for (int[] row : smaller) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}