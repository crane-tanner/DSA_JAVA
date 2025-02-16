public class Main {
    public static void main(String[] args) {
        int[] myArray = {4, 1, 6, 0, 3};
        insertionSort(myArray);

        for(int num : myArray) {
            System.out.print(num + " ");
        }

    }

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while(j > -1 && temp < arr[j]) {
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}