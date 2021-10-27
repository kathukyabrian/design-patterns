package tech.meliora.natujenge;

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
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        int currentPositionInRanked = ranked.size()-1;
        int currentPositionInPlayer = 0;
        for(int i=currentPositionInRanked; i>-1; i--){
            // do sth

            for(int j=currentPositionInPlayer; j<player.size(); j++){
                if(player.get(j)<ranked.get(i)){
                    ranked.add(i+1,player.get(j));
                    j = currentPositionInPlayer+1;
                    i = currentPositionInRanked-1;
                }
                break;
            }



        }

        System.out.println(ranked);
        return ranked;
    }

    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(100);
        ranked.add(50);
        ranked.add(40);
        ranked.add(40);
        ranked.add(20);
        ranked.add(10);

        List<Integer> player = new ArrayList<>();
        player.add(5);
        player.add(25);
        player.add(50);
        player.add(120);


        climbingLeaderboard(ranked, player);
    }

//    public static class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                    .map(Integer::parseInt)
//                    .collect(toList());
//
//            int playerCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                    .map(Integer::parseInt)
//                    .collect(toList());
//
//            List<Integer> result = Result.climbingLeaderboard(ranked, player);
//
//            bufferedWriter.write(
//                    result.stream()
//                            .map(Object::toString)
//                            .collect(joining("\n"))
//                            + "\n"
//            );
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//    }

}



