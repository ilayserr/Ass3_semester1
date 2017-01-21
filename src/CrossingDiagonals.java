/*
Assignment number : 3.2
File Name : CrossingDiagonals.java
Name : Ilay Serr
Email : ilay92@gmail.com
 */
/*
 * reads in a square matrix with the given format and checks if the matrix 
 * has a same number left diagonal and a same number bottom diagonal.
 * same number left diagonal - any sequence of two or more elements
 * which have the same value and completely lie on a diagonal starting
 * from the left edge of the matrix and going in the bottom­right direction,
 * until the lower edge of the matrix
 */
public class CrossingDiagonals {

	public static void main(String[] args) {
		
		// recieve the size of the first number in the
		// text and make a squre matrix (N x N).
		int N = StdIn.readInt();
		int[][] a = new int [N][N];

		// filling a double array with the numbers from the text file.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N;  j++) {
				a[i][j] = StdIn.readInt();
			}
		}

		// c is the column index number. starting with the first column
		int c = 0;
		boolean left = false;

		// run on every possible left diagonal and checks if 
		// there is a diagonal from the left edge until the bottom.
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N - 1; j++) {
				if (a[j][c] == a[j + 1][c + 1]) {
					c++;
					
					// check if there is a left diagonal until the last row.
					// and if there is - get out of the loop.
					if (j + 1 == N - 1) {
						left = true;
						break;
					}

					// if the next integer doesn't fit the current diagonal,
					// change c (column) back to 0 and get out of the loop.
				} else {
					c = 0;
					break;
				}
			}

			// if it found a left diagonal - get out of the loop.
			if (left == true) break;
		}

		// checking if there is a right to bottom diagonal. (same difinition as 
		// same bottom diagonal).
		// c2 is the column index number. starting with the last column
		int c2 = N - 1;
		boolean right = false;

		// run on every possible right diagonal and checks if 
		// there is a diagonal from the right edge until the bottom.
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N - 1; j++) {
				if (a[j][c2] == a[j + 1][c2 - 1]) {
					c2--;

					// check if there is a right diagonal until the last row.
					// and if there is - get out of the loop.
					if (j + 1 == N - 1) {
						right = true;
						break;
					}

				// if the next integer doesn't fit the diagonal
				// change c2 (column) to (N-1) and get out of the loop.
				} else {
					c2 = N - 1;
					break;
				}
			}

			// if it found a right diagonal - get out of the loop.
			if (right == true) break;
		}

		// im checking if the last column indices cross each other.
		// if both right and left diagonals exist - and the diagonals
		// cross each other or merge at the end. print true.	
		if ((left) && (right) && (c2 <= c)) {
			System.out.println("true");
		} else System.out.println("false");
	}
}
	

