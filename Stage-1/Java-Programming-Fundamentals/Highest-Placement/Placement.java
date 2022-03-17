import java.util.Scanner;
import java.util.Arrays;

public class Placement {
    public static void main(String[] args) {
        String[] dept = { "CSE", "ECE", "MECH" };
        int[] plcmnt = new int[3];
        int max = 0;
        String res = "";
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < dept.length; i++) {
            System.out.print("\nEnter the no of students placed in " + dept[i] + ":");
            plcmnt[i] = in.nextInt();
            if (plcmnt[i] != 0 && plcmnt[i] >= max)
                max = plcmnt[i];
        }
        in.close();
        for (int i = 0; i < dept.length; i++) {
            if(plcmnt[i] == max){
                res = res + dept[i] + "\n";
            }
            else if(plcmnt[i] < 0){
                System.out.println("\nInput is Invalid");
                return;
            }
        }
        res.trim();
        if (res == "" || Arrays.stream(plcmnt).distinct().count() == 1)
            System.out.println("None of the department has got the highest placement");
        else
            System.out.println("Highest placement\n" + res);
        in.close();

    }
}