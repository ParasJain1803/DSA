public class LastOccurence {
     public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 0, 8, 1, 23};
        System.out.println(lastOcc(arr, 1, 0));
    }

     public static int lastOcc(int[] a, int key, int i) {
        if (i == a.length) {
            return -1;
        }  
        int isFound = lastOcc(a, key, i+1);
        if (isFound == -1 && a[i] == key) {
            return i;
        }
        return isFound;
    }
}

