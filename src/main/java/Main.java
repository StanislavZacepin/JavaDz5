import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1}, nums2 = new int[]{2, 2};
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> Array = new HashMap<>(); // Ключ = число, значения = количестов этого числа
        for (int i = 0; i < 10; i++) {
            Array.put(i, 0);
        }
        Array = Count(Array, nums1);
        Array = Count(Array, nums2);


        return;
    }

    public HashMap<Integer, Integer> Count(HashMap<Integer, Integer> Array, int[] nums) {
        for (int i : nums) {
            switch (i) {
                case (0):
                    Array.put(0, ++);
                    break;
                case (1):
                    Array.put(1, ++);
                    break;
                case (2):
                    Array.put(2, ++);
                    break;
                case (3):
                    Array.put(3, ++);
                    break;
                case (4):
                    Array.put(4, ++);
                    break;
                case (5):
                    Array.put(5, ++);
                    break;
                case (6):
                    Array.put(6, ++);
                    break;
                case (7):
                    Array.put(7, ++);
                    break;
                case (8):
                    Array.put(8, ++);
                    break;
                case (9):
                    Array.put(0, ++);
                    break;

            }
        }
        return Array;
    }

