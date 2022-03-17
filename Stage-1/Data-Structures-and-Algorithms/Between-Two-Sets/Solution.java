import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

        public static int getGCD(int n1, int n2) {
            if (n2 == 0) {
                return n1;
            }
            return getGCD(n2, n1 % n2);
        }

        public static int getLCM(int n1, int n2) {
            if (n1 == 0 || n2 == 0)
                return 0;
            else {
                int gcd = getGCD(n1, n2);
                return Math.abs(n1 * n2) / gcd;
            }
        }
        
        public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
            int result = 0;

            int lcm = a.get(0);
            for (Integer integer : a) 
                lcm = getLCM(lcm, integer); 

            int gcd = b.get(0);
            for (Integer integer : b) 
                gcd = getGCD(gcd, integer);


            int i = 0;
            while (i <= gcd) {
                i += lcm;
                if (gcd % i == 0)
                    result++;
            }
            return result;
        }

    }

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
