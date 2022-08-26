import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        intersect(nums1, nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> s = new ArrayList<>();
        int i = 0;
        int j = 0;

        while ((i < nums1.length) && (j < nums2.length)) {

            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                s.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] res = new int[s.size()];

        int k = 0;

        for (Integer val : s) {
            res[k++] = val;
        }

        return res;
    }
}
