import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	/*
					1
				1       1
			1       2       1
		1       3       3       1
	1       4       6       4       1


	 */


	public static List<List<Integer>> generate(int numRows) {

		return generate(numRows, new ArrayList<List<Integer>>());

	}

	public static List<List<Integer>> generate(int numRows, List<List<Integer>> pascals) {
		if (numRows == 0) return null;
		if (numRows == 1) {
			ArrayList<Integer> ints = new ArrayList<Integer>();
			ints.add(1);
			pascals.add(ints);
			return pascals;
		}

		pascals = generate(numRows - 1, pascals);
		return pascals;
	}

	public static void main(String[] args) {
		List<List<Integer>> pascals = generate(1);
	}
}
