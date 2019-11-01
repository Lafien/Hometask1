import java.math.BigDecimal;
import java.util.ArrayList;

class MultidimensionalArrays {
    static BigDecimal multMain = BigDecimal.valueOf(1);
    static BigDecimal multCollateral = BigDecimal.valueOf(1);


    static String SumAndMultDiagonal() {
        String mess = "";
        MyArray arr1 = new MyArray(8, 8, 1, 99);
        int[][] array = arr1.arrayTwoDimensional;
        int sumMain = 0;
        int sumCollateral = 0;

        mess+="\n1)Sum and multiply of diagonals:\n";

        mess+=MyArray.getMassiv(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    sumMain += array[i][j];

                    multMain = multMain.multiply(BigDecimal.valueOf(array[i][j]));
                }
            }

        }

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {

            sumCollateral += array[i][j];

            multCollateral = multCollateral.multiply(BigDecimal.valueOf(array[i][j]));

        }

        mess+="The sum of the main diagonal: " + sumMain + ", the multiply of the main diagonal: " + multMain + "\n";
        mess+="The sum of the collateral diagonal: " + sumCollateral + ", the multiply of the collateral diagonal: " + multCollateral + "\n";
        return mess;

    }

    static String FindingTheMaximumElementInTwoDimensionalArray() {
        String mess="";
        MyArray arr1 = new MyArray(8, 8, -99, 99);
        int[][] array = arr1.arrayTwoDimensional;
        int max = array[0][0];
        int maxI = 0;
        int maxJ = 0;

        mess+="\n2)Finding The Maximum Element In Two Dimensional Array:\n";

        mess+=MyArray.getMassiv(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }

        }

        mess+="Max element: " + max + ", its index: [" + maxI + "][" + maxJ + "]\n";
        return mess;

    }

    static String TheLineWithTheLargestProduct() {
        String mess="";
        MyArray arr1 = new MyArray(8, 8, -10, 10);
        int[][] array = arr1.arrayTwoDimensional;
        ArrayList < Long > list = new ArrayList< Long>();
        long mult = 1;
        long max = 0;
        long maxI = 0;

        mess+="\n3)The Line With The Largest Product:\n";

        mess+=MyArray.getMassiv(array);

        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                mult *= ints[j];
            }
            list.add(Math.abs(mult));
            mult = 1;
        }

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                maxI = i;
            }
        }

        mess+="Max line: " + max + ", its index: [" + maxI + "]\n";
        return mess;

    }

    static String SortingArrayLines() {
        String mess="";
        MyArray arr1 = new MyArray(8, 5, 0, 100);
        int[][] array = arr1.arrayTwoDimensional;
        int buf;

        mess+="\n4)Sorting Array Lines:\n";
        mess+="Before sorting:\n";

        mess+=MyArray.getMassiv(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 1; k < array[0].length; k++) {
                    if (array[i][k - 1] > array[i][k]) {
                        buf = array[i][k - 1];
                        array[i][k - 1] = array[i][k];
                        array[i][k] = buf;
                    }
                }
            }
        }

        mess+="\nAfter sorting:\n";

        mess+=MyArray.getMassiv(array);
        return mess;
    }
}