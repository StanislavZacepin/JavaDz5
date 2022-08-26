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
        int value = 0;
        for (int i : nums) {
            switch (i) {
                case (0):
                    value =  Array.get(i);
                    Array.put(0, value+1);
                    break;
                case (1):
                    value =  Array.get(i);
                    Array.put(1, value+1);
                    break;
                case (2):
                    value =  Array.get(i);
                    Array.put(2, value+1);
                    break;
                case (3):
                    value =  Array.get(i);
                    Array.put(3, value+1);
                    break;
                case (4):
                    value =  Array.get(i);
                    Array.put(4, value+1);
                    break;
                case (5):
                    value =  Array.get(i);
                    Array.put(5, value+1);
                    break;
                case (6):
                    value =  Array.get(i);
                    Array.put(6, value+1);
                    break;
                case (7):
                    value =  Array.get(i);
                    Array.put(7, value+1);
                    break;
                case (8):
                    value =  Array.get(i);
                    Array.put(8, value+1);
                    break;
                case (9):
                    value =  Array.get(i);
                    Array.put(9, value+1);
                    break;

            }
        }

    }
}
