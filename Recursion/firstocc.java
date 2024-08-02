public class firstocc {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int item = 3;
        System.out.println(find(arr, 0, item));
    }

    public static int find(int arr[], int idx, int item) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == item) {
            return idx;
        }
        return find(arr, idx + 1, item);
    }

}
