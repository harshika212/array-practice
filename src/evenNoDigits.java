public class evenNoDigits {
    public static void main(String[] args) {
        int[] nums = {34, 45, 6666, 443, 2, 43};
        int c = 0;
        for (int num : nums) {
            int digit = 0;
            while (num > 0) {
                num = num / 10;
                digit++;
            }
            if (digit % 2==0){
                c++;
            }
        }
        System.out.println(c);
    }
}