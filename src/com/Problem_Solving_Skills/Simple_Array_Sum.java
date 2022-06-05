package com.Problem_Solving_Skills;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class Result {
	/***
	 * Function is expected to return an INTEGER. The function
	 */

	
	public static int simpleArraySum(List<Integer> ar) {
		System.out.println("Entered Result Class");
		int temp = 0;
		for (int i = 0; i < ar.size(); i++)
			temp = temp + ar.get(i);
		return temp;
	}
}

public class Simple_Array_Sum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arCount = Integer.parseInt(br.readLine().trim());

		List<Integer> ar = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());
		
		
		int result = Result.simpleArraySum(ar);
		System.out.println("Result is : " +result);

		br.close();
		
	}

}
