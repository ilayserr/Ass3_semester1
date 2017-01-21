/*
Assignment number : 3.1
File Name : Reflect.java
Name : Ilay Serr
Email : ilay92@gmail.com
 */
/*
 * read in a text file in the given format. 
 * After reading, the program prints out the data of the matrix upside­down.
 */
public class Reflect {

	public static void main(String[] args) {

		// recieve the size of the first number in the text and make a matrix.
		int N = StdIn.readInt();
		int[][] a = new int [N][N];

		// filling a double array with the numbers from the text file.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N;  j++) {
				a[i][j] = StdIn.readInt();
			}
		}

		// printing the array from the last row to the first.
		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j < N;  j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}	

	}

}
