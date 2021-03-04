public class PrintArray {
    public static void printArray(int[][] array, String separator) {
        for (int[] row : array
        ) {
            for (int element : row
            ) {
                System.out.print(element);
                System.out.print(separator);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        printArray(array, " | ");
    }
}
