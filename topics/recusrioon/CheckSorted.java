

public class CheckSorted {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 0, 8, 1, 23};
        System.out.println(isSorted(arr, 0)); 
    }

    public static boolean isSorted(int a[], int i) {
        if (i == a.length-1) {
            return true;
        }

        if (a[i]>a[i+1]) {
            return false;
        }

        return isSorted(a, i+1);
    }

}
