/*
Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.

Example

Scores are in the same order as the games played. She tabulates her results as follows:

                                     Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.

Function Description

Complete the breakingRecords function in the editor below.

breakingRecords has the following parameter(s):

int scores[n]: points scored per game
Returns

int[2]: An array with the numbers of times she broke her records. Index  is for breaking most points records, and index  is for breaking least points records.
Input Format

The first line contains an integer , the number of games.
The second line contains  space-separated integers describing the respective values of .

Constraints

Sample Input 0

9
10 5 20 20 4 5 2 25 1
Sample Output 0

2 4
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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    

int currentMin = scores.get(0);
int currentMax = scores.get(0);
int countMaxBreaks = 0;
int countMinBreaks = 0;

for (int i = 1; i < scores.size(); i++) {
int currentScore = scores.get(i);


if (currentScore > currentMax) {
currentMax = currentScore;
countMaxBreaks++;
}


if (currentScore < currentMin) {
currentMin = currentScore;
countMinBreaks++;
}
}


List<Integer> result = new ArrayList<>();
result.add(countMaxBreaks);
result.add(countMinBreaks);
return result;
}


    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

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
