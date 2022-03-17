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
     * Complete the 'componentsInGraph' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY gb as parameter.
     */
    static java.util.function.IntUnaryOperator find;

    public static List<Integer> componentsInGraph(List<List<Integer>> gb) {
    // Write your code here

        int N = gb.size();
        int n = 2*N + 1;
        int[] parent = java.util.stream.IntStream.range(0, n).toArray();
        int[] size = java.util.stream.IntStream.range(0, n).map(i -> 1).toArray();

        // Find by Path Compression
        find = x -> {
            if(parent[x]!=x) parent[x]=find.applyAsInt(parent[x]);
            return parent[x];
        };

        // Union by Size
        for(List<Integer> edge : gb) { 
            int root1 = find.applyAsInt(edge.get(0));
            int root2 = find.applyAsInt(edge.get(1));
            if(root1 == root2) continue;

            if(size[root1] > size[root2]) {                
                int r = root1;
                root1 = root2;
                root2 = r;
            }
            parent[root1] = root2;
            size[root2] += size[root1];
            size[root1] = 0;
        }

        IntSummaryStatistics s = Arrays.stream(size)
                                                .filter(i -> i>1)
                                                .summaryStatistics();
        return new ArrayList<Integer>(Arrays.asList(s.getMin(), s.getMax()));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> gb = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                gb.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.componentsInGraph(gb);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
