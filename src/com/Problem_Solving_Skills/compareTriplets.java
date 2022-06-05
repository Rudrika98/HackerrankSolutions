package com.Problem_Solving_Skills;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


class ResultOne {

    /*
     * Complete the 'compareTriplets' function below.
     * Compare Triplets 
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here
    int al =0, bo =0; 
    
    if(a.size()== b.size()){
        for(int i =0; i<a.size() ; i++){
            if(a.get(i) > b.get(i)){
                al = al +1;
            } else if (a.get(i) == b.get(i)){
                    al = al + 0; 
                    bo = bo + 0;
            } else if(b.get(i) > a.get(i)){
                bo = bo + 1; 
            }
        }
    }
    List<Integer> arr = new ArrayList<Integer>();
    arr.add(al); 
    arr.add(bo);
        return arr;
    }

}

public class compareTriplets {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		List<Integer> a = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());
		
		  List<Integer> b = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
		            .map(Integer::parseInt)
		            .collect(toList());
		  List<Integer> result = ResultOne.compareTriplets(a, b);
		  
		  System.out.println(result);
		  
	}

}
