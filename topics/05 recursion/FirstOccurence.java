public class FirstOccurence {
     public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 0, 8, 1, 23};
        System.out.println(firstOcc(arr, 1, 0));
    }

    public static int firstOcc(int a[], int key, int i) {
        if (i == a.length) {
            return -1;
        }
        
        if (a[i] == key) {
            return i;
        }
        return  firstOcc(a, key, i+1);
    }
}