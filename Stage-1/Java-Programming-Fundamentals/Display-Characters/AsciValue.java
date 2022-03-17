import java.util.Scanner;

public class AsciValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int[] nums = new int[4];

        for(int i=0; i<4; i++)
            nums[i] = in.nextInt();
        in.close();
        for(int i=0; i<4; i++)
            System.out.println(nums[i] + "-" + (char)nums[i]);
    }
}
