public class divideConquor {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if(si>=ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr,si,mid);                  // left part
        mergeSort(arr,mid+1,ei);                // right part
        merger(arr,si,mid,ei);                  // merging them
    }

    public static void merger(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;                             // iterator for left part
        int j = mid+1;                          // iterator for right part
        int k=0;                                // iterator for temp array

        while(i<=mid && j<=ei) {                // compairing and 
            if(arr[i]<arr[j]) {                 // putting them
                temp[k] = arr[i];               // in temp array
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            temp[k++]=arr[i++];                 // remaining left part
        }
        while(j<=ei) {
            temp[k++]=arr[j++];                 // remaining right part
        }
        for(k=0, i=si; k<temp.length; k++,i++) {
            arr[i] = temp[k];                   //copying to orignal array 
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,10,3,2,8,9,5,6,7,1};
        printArray(arr);
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
