package Array;

public class MoveZeroes {
        public static void moveZeroes(int[] nums) {
            int lastNonZeroFoundAt = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[lastNonZeroFoundAt] = nums[i];
                    lastNonZeroFoundAt++;
                }
            }

            for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
                nums[i] = 0;
            }
        }

        public static void main(String[] args) {
            int[] nums = {0, 1, 0, 3, 12};
            moveZeroes(nums);

            System.out.print("Output: [");
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
                if (i < nums.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
}
