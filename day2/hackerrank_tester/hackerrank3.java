
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
    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonal1Sum = 0, diagonal2Sum = 0, adsolute_sum = 0;
        for (List<Integer> list : arr) {
            int j = 0;
            for (int i : list) {
                if (i == j)
                    diagonal1Sum = diagonal1Sum + list.get(i);
                if (i == j + list.size())
                    diagonal2Sum = diagonal2Sum + list.get(i);

            }
            j++;
        }
        if (diagonal1Sum > diagonal2Sum)
            adsolute_sum = diagonal1Sum - diagonal2Sum;
        if (diagonal2Sum > diagonal1Sum)
            adsolute_sum = diagonal2Sum - diagonal1Sum;
        return adsolute_sum;
    }

}

public class hackerrank3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
