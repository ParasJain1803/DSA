public class Solutions {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5, 6, 2, 4, 4, 8, 2, 4};
        // allOccurences(arr, 4, 0);
        englishConverter(1234);
    }

    public static void allOccurences(int arr[], int key, int i) {
        if (arr.length == i) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        allOccurences(arr, key, i+1);
    }

    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six",
         "seven", "eight", "nine"};

    public static void englishConverter(int num) {
        if(num == 0) {
            return;
        }

        englishConverter(num/10);
        int last = num%10;
        System.out.print(digits[last] +" ");
    }
}
