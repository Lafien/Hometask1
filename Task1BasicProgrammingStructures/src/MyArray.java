
public class MyArray {

    int[] array;
    int[][] arrayTwoDimensional;


    MyArray(int sizeI, int leftBorder, int rightBorder) {
        this.array = new int[sizeI];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((leftBorder + Math.random() * (rightBorder - leftBorder)));
        }
    }

    MyArray(int sizeI, int sizeJ, int leftBorder, int rightBorder) {
        this.arrayTwoDimensional = new int[sizeI][sizeJ];
        for (int i = 0; i < arrayTwoDimensional.length; i++) {
            for (int j = 0; j < arrayTwoDimensional[0].length; j++) {
                arrayTwoDimensional[i][j] = (int) Math.round((leftBorder + Math.random() * (rightBorder - leftBorder)));
            }
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    static String getMassiv(int[] array) {
        String mess = "\n";
        for (int value : array) {
            mess += value + " ";
        }
        return mess;
    }

    static String getMassiv(int[][] arrayTwoDimensional) {
        String mess = "\n";

        for (int[] ints : arrayTwoDimensional) {
            for (int j = 0; j < arrayTwoDimensional[0].length; j++) {
                mess += " " + ints[j] + " ";
                //System.out.print(" " + arrayTwoDimensional[i][j] + " ");
            }
            mess += "\n";
        }

        return mess;
    }

    public static void printArray(int[][] arrayTwoDimensional) {
        for (int[] ints : arrayTwoDimensional) {
            for (int j = 0; j < arrayTwoDimensional[0].length; j++) {
                System.out.print(" " + ints[j] + " ");
            }
            System.out.println();
        }
    }
}