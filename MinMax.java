public class MinMax {
    public static void main(String[] args) {

        int nums[] = {34, -56, 1013, -1994, 556, 289, 43, -52, 99, 158};

        int min, max;

        min = max = nums[0];

        for(int i = 1; i < 10; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("Min: " + min + " Max: " + max);
    }
}