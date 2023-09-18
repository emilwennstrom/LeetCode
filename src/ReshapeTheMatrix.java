
public class ReshapeTheMatrix {
	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		if (r * c != mat[0].length * mat.length) {
			return mat;
		}
		int[][] newMat = new int[r][c];
		int row = 0;
		int col = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				newMat[row][col] = mat[i][j];
				col++;
				if (col == c) {
					col = 0;
					row++;
				}
			}
		}
		return newMat;
	}


	public static void main(String[] args) {
		int[][] mat = new int[4][2];
		int k = 1;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = k++;
			}
		}

		printMat(mat);


		mat = matrixReshape(mat, 2, 4);
		printMat(mat);

	}


	static void printMat(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
