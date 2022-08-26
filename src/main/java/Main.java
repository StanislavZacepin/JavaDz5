import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1}, nums2 = new int[]{2, 2};
         int[] num3 = intersect(nums1,nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> Array = new HashMap<>(); // Ключ = число, значения = количестов этого числа
        for (int i = 0; i < 10; i++) {
            Array.put(i, 0);
        }
        int count = 0;
        Counts(Array, nums1);
        Counts(Array, nums2);


        return null;
    }

    public static void Counts(HashMap<Integer, Integer> Array, int[] nums) {
        for (int i : nums) {
            switch (i) {
                case (0):
                    Array.put(0, +1);
                    break;
                case (1):
                    Array.put(1, +1);
                    break;
                case (2):
                    Array.put(2, +1);
                    break;
                case (3):
                    Array.put(3, +1);
                    break;
                case (4):
                    Array.put(4, +1);
                    break;
                case (5):
                    Array.put(5, +1);
                    break;
                case (6):
                    Array.put(6, +1);
                    break;
                case (7):
                    Array.put(7, +1);
                    break;
                case (8):
                    Array.put(8, +1);
                    break;
                case (9):
                    Array.put(9, +1);
                    break;

            }
        }

    }
}
