import java.util.*;
public class Main {
    public static int[] leader(int[] arr) {
        int n = arr.length;
        int ind = n - 1;
        int maxlen = arr[ind];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxlen) {
                maxlen = arr[i];
                ind--;
                arr[ind] = arr[i];
            }

        }
        int[] res = new int[n - ind];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[ind++];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] nums = leader(arr);
        System.out.print(Arrays.toString(nums));
    }
}


// OUTPUT:
// 6
// 16 17 4 3 5 2
// [17, 5, 2]
