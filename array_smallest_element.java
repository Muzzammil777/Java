public class array_smallest_element {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
    }
}
