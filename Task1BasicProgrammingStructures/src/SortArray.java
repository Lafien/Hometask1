import java.util.Arrays;

class SortArray {
    int[] arr1;
    int[] arr2;
    int[] arr3;

    SortArray(int n) {
        MyArray array = new MyArray(n, -1000, 1000);
        this.arr1 = array.array;
        this.arr2 = new int[n];
        this.arr3 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            arr3[i] = arr1[i];
        }

    }

    static String DefaultSort(int[] arr) {
        String mess;
        long startTime = System.nanoTime();
        Arrays.sort(arr);
        long estimatedTime = System.nanoTime() - startTime;
        mess = "Time on DefaultSort:" + estimatedTime / 1000000000.0 + " sec";
        return mess;
    }

    static String BubbleSort(int[] arr) {
        String mess;
        long startTime = System.nanoTime();
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        mess = "Time on BubbleSort:" + estimatedTime / 1000000000.0 + " sec";
        return mess;
    }

    static String ChooseSort(int[] arr) {
        String mess;
        long startTime = System.nanoTime();
        int min;
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        long estimatedTime = System.nanoTime() - startTime;
        mess = "Time on ChooseSort:" + estimatedTime / 1000000000.0 + " sec";
        return mess;
    }

}