/*The previous challenges covered Insertion Sort, which is a simple and intuitive sorting algorithm with a running time of . In these next few challenges, we're covering a divide-and-conquer algorithm called Quicksort (also known as Partition Sort). This challenge is a modified version of the algorithm that only addresses partitioning. It is implemented as follows:

Step 1: Divide
Choose some pivot element, , and partition your unsorted array, , into three smaller arrays: , , and , where each element in , each element in , and each element in .

Example

In this challenge, the pivot will always be at , so the pivot is .

 is divided into , , and .
Putting them all together, you get . There is a flexible checker that allows the elements of  and  to be in any order. For example,  is valid as well.

Given  and , partition  into , , and  using the Divide instructions above. Return a 1-dimensional array containing each element in  first, followed by each element in , followed by each element in .

Function Description

Complete the quickSort function in the editor below.

quickSort has the following parameter(s):

int arr[n]:  is the pivot element
Returns

int[n]: an array of integers as described above
Input Format

The first line contains , the size of .
The second line contains  space-separated integers  (the unsorted array). The first integer, , is the pivot element, .

Constraints

 where 
All elements are distinct.
Sample Input

STDIN       Function
-----       --------
5           arr[] size n =5
4 5 3 7 2   arr =[4, 5, 3, 7, 2]
Sample Output

3 2 4 5 7
*/
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
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.quickSort(arr);

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
