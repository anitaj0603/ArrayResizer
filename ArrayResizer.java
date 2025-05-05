public class ArrayResizer {
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int value : array2D[r]) {
            if (value == 0) {
                return false;
            }
        }
        return true;
    }

    public static int numNonZeroRows(int[][] array2D) {
        int count = 0;
        for (int row = 0; row < array2D.length; row++) {
            if (isNonZeroRow(array2D, row)) {
                count++;
            }
        }
        return count;
    }

    public static int[][] resize(int[][] array2D) {
        int rows = numNonZeroRows(array2D);
        int cols = array2D[0].length;
        int[][] result = new int[rows][cols];
        int newRow = 0;
        
        for (int row = 0; row < array2D.length; row++) {
            if (isNonZeroRow(array2D, row)) {
                result[newRow] = array2D[row];
                newRow++;
            }
        }
        return result;
    }
}