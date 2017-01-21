/*
Assignment number : 3.3
File Name : Knights.java
Name : Ilay Serr
Email : ilay92@gmail.com
 */
/*
 * reads in a square matrix of positive integers with the given format (the matrix can be of any size).
 * The program then looks for a location in the matrix such that if a knight is positioned at that location
 * all possible moves will land the knight on elements which have the same value. 
 * The program then alerts the user to the existence of such a location.
 */

public class Knights {

	public static void main(String[] args) {
		
		// recieve the size of the first number in the text and make 
		// a squre matrix in the size (N x N).
		int N = StdIn.readInt();
		int[][] a = new int [N + 4][N + 4];

		// filling a double array with the numbers from the text file.
		for (int i = 2; i < N + 2; i++) {
			for (int j = 2; j < N + 2;  j++) {
				a[i][j] = StdIn.readInt();
			}
		}
		
		// making an  argument that will get the future value of the numbers 
		int temp = (-1);
		boolean f = false;

		// checking what is the number that the knight step on.
		// (and making sure is not 0)
		for (int i = 2; i <= N + 1; i++) {
			for (int j = 2; j <= N + 1;  j++) {
				if (a[i - 2][j - 1] != 0) temp = a[i - 2][j - 1]; 
				else if (a[i - 2][j + 1] != 0) temp = a[i - 2][j + 1]; 
				else if (a[i - 1][j - 2] != 0) temp = a[i - 1][j - 2];
				else if (a[i - 1][j + 2] != 0) temp = a[i - 1][j + 2];
				else if (a[i + 1][j - 2] != 0) temp = a[i + 1][j - 2];
				else if (a[i + 1][j + 2] != 0) temp = a[i + 1][j + 2];
				else if (a[i + 2][j - 1] != 0) temp = a[i + 2][j - 1];
				else if (a[i + 2][j + 1] != 0) temp = a[i + 2][j + 1];

				// checking if all the possible steps of the knight are equals
				// or equal to '0' (that means the knight is next to a wall)
				if (((a[i - 2][j - 1] == temp) || (a[i - 2][j - 1] == 0)) 
					&& ((a[i - 2][j + 1] == temp) || (a[i - 2][j + 1] == 0)) 
					&& ((a[i - 1][j - 2] == temp) || (a[i - 1][j - 2] == 0)) 
					&& ((a[i - 1][j + 2] == temp) || (a[i - 1][j + 2] == 0)) 
					&& ((a[i + 1][j - 2] == temp) || (a[i + 1][j - 2] == 0)) 
					&& ((a[i + 1][j + 2] == temp) || (a[i + 1][j + 2] == 0)) 
					&& ((a[i + 2][j - 1] == temp) || (a[i + 2][j - 1] == 0)) 
					&& ((a[i + 2][j + 1] == temp) || (a[i + 2][j + 1] == 0))) {
					System.out.println("A Knight at location (" + (i - 2) + "," 
					+ (j - 2) + ") is surrounded by the number " + temp);
					f = true;
				}

				// getting out of the loop if we found a knight that
				// answer the conditions.
				if (f) break;
			}
			if (f) break;
		}

		// printing if there is no knight that answer the conditions.
		if (f == false) System.out.println("No location found");
	}
}
