public class Main {
    public static void main(String[] args) {

        int[] myArray = {9,5,2,1,4};

        bubbleSort(myArray);

        for(int num : myArray) {
            System.out.print(num + " ");
        }

    }

    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}