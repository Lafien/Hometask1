class OneDimensionalArrays {
    static String ArrayOfOddNumbers() {
        String mess="";
        int[] array = new int[50];
        for (int i = 0, j = 1; i < array.length; i++, j += 2) {
            array[i] = j;
        }
        mess+="\n1)Array Of Odd Numbers\n";

        mess+=MyArray.getMassiv(array);
        mess+="\n";
        for (int i = array.length - 1; i >= 0; i--) {
            mess+=array[i] + " ";
        }
        return mess;
    }

    static String EvenAndOddArrayElements() {
        String mess="";
        MyArray arr1 = new MyArray(20, 0, 10);
        int[] array = arr1.array;
        int even = 0;
        int odd = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        mess+="\n\n2)Even And Odd Array Elements\n";

        mess+=MyArray.getMassiv(array);

        mess+="\nEven count: " + even + ", odd count: " + odd +"\n";
        return mess;
    }

    static String ReplaceAnElementWithAnOddIndex() {
        String mess="";
        MyArray arr1 = new MyArray(10, 1, 100);
        int[] array = arr1.array;

        mess+="\n3)Replace An Element With An Odd Index\n";
        mess+=MyArray.getMassiv(array);

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        mess+="\n";
        mess+=MyArray.getMassiv(array);
        return mess;

    }

    static String MaximumAndMinimumArrayElement() {
        String mess="";
        MyArray arr1 = new MyArray(15, -50, 50);
        int[] array = arr1.array;
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        mess+="\n\n4)Maximum And Minimum Array Element\n";
        mess+=MyArray.getMassiv(array);

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }

        mess+="\n" + "Minimum: " + min + ", index: " + minIndex + ", maximum: " + max + ", index: " + maxIndex + "\n";
        return mess;

    }

    public static String TheAverageValuesOfTwoArrays() {
        String mess="";
        MyArray arr1 = new MyArray(10, 0, 10);
        MyArray arr2 = new MyArray(10, 0, 10);
        int[] array1 = arr1.array;
        int[] array2 = arr2.array;
        double avgA;
        int sumA = 0;
        double avgB;
        int sumB = 0;

        mess+="\n5)The Average Values Of Two Arrays\n";
        mess+=MyArray.getMassiv(array1);
        mess+="\n";
        mess+=MyArray.getMassiv(array2);
        for (int i = 0; i < array2.length; i++) {
            sumA += array1[i];
            sumB += array2[i];
        }
        avgA = sumA / (double) array1.length;
        avgB = sumB / (double) array2.length;


        mess+="\nAverage value first array: " + avgA + ", average value second array: " + avgB + "\n";
        if (avgA > avgB) {
            mess+="Average value first array bigger average value second array\n";
        } else if (avgA < avgB) {
            mess+="Average value second array bigger average value first array\n";
        } else {
            mess+="Arrays equals\n";
        }
        return mess;

    }

    static String RepeatingAnElementInAnArray() {
        String mess="";
        MyArray arr1 = new MyArray(20, -1, 1);
        int[] array = arr1.array;
        int count1 = 0; //count -1
        int count2 = 0; //count 0
        int count3 = 0; //count 1


        mess+="\n6)Repeating An Element In An Array\n";
        mess+=MyArray.getMassiv(array);

        for (int value : array) {
            if (value == -1) {
                count1++;
            } else if (value == 0) {
                count2++;
            } else {
                count3++;
            }
        }

        if (count1 > count2 && count1 > count3) {
            mess+="\nThe most common number: " + "-1, " + count1 + " times\n";
        } else if (count2 > count1 && count2 > count3) {
            mess+="\nThe most common number: " + "0, " + count2 + " times\n";
        } else if (count3 > count1 && count3 > count2) {
            mess+="\nThe most common number: " + "1, " + count3 + " times\n";
        } else if (count1 == count2) {
            mess+="\nThe most common number: " + "-1, " + count1 + " times, and 0, " + count2 + " times\n";
        } else if (count1 == count3) {
            mess+="\nThe most common number: " + "-1, " + count1 + " times, and 1, " + count3 + " times\n";
        } else if (count2 == count3) {
            mess+="\nThe most common number: " + "0, " + count2 + " times, and 1, " + count3 + " times\n";
        }
        return mess;

    }
}
