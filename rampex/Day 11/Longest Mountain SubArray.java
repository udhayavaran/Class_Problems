import java.util.*;

public class Mountain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        List<Integer> result = findLargestMountain(arr);
        System.out.println(result);
    }

    public static List<Integer> findLargestMountain(int[] arr) {
        int n = arr.length;
        int maxPeak = Integer.MIN_VALUE;
        int peakIndex = -1;

        // Step 1: Find largest peak
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                if (arr[i] > maxPeak) {
                    maxPeak = arr[i];
                    peakIndex = i;
                }
            }
        }

        // No peak found
        if (peakIndex == -1) return new ArrayList<>();

        // Step 2: Expand left
        int left = peakIndex;
        while (left > 0 && arr[left] > arr[left - 1]) {
            left--;
        }

        // Step 3: Expand right
        int right = peakIndex;
        while (right < n - 1 && arr[right] > arr[right + 1]) {
            right++;
        }

        // Collect result
        List<Integer> mountain = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            mountain.add(arr[i]);
        }

        return mountain;
    }
}
