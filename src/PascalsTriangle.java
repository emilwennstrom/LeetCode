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




	public static List<List<Integer>> generate(int numRows)
	{
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for(int i = 0; i < numRows; i++) {
			row.add(0, 1);
			for(int j = 1; j < row.size() - 1; j++)
				row.set(j, row.get(j) + row.get(j + 1));
			allrows.add(new ArrayList<Integer>(row));
		}
		return allrows;

	}

	public static void main(String[] args) {
		List<List<Integer>> pascals = generate(4);
		for (List<Integer> list : pascals) {
			for (Integer i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
