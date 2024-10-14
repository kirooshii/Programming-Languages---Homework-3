public class Maxima {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 4, 3, 5, 9, 4, 6, 8};

        findLocalMaxima(arr);
    }

    public static void findLocalMaxima(int[] arr) {
        int size = arr.length;

        if (size < 2) return;

        // Check first element
        if (arr[0] > arr[1]) {
            System.out.print(arr[0] + " ");
        }

        // Check middle elements
        for (int i = 1; i < size - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        // Check last element
        if (arr[size - 1] > arr[size - 2]) {
            System.out.print(arr[size - 1]);
        }
    }
}
