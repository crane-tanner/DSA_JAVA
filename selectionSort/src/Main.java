public class Main {
    public static void main(String[] args) {
        int [] array = {5, 2, 3, 7, 9};
        selectionSort(array);
        for(int num : array) {
        System.out.print(num + " ");
        }
    }
    }


    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;
            }

            if (min_index != i) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
}