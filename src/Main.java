import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

    public static void main(String[] args) {
        outputOddNums();
        System.out.println(nums);
    }

    public static void outputOddNums() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}