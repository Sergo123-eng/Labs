
public class Loops {
public static void main(String[] args) {
	/****************(Displ~y numbers in a pyramid pattern) Write a nested for loop that prints the
	 * following output
	 * 1 row 0
1 2 1 row 1
1 2 4 2 1  row 2
1 2 4 8 4 2 1   row 3
1 2 4 8 16 8 4 2 1  row 4
1 2 4 8 16 32 16 8 4 2 1 row 5
1 2 4 8 16 32 64 32 16 8 4 2 1 row 6
1 2 4 8 16 32 64 128 64 32 16 8 4 2 1 row 7

	 */
	
	int rows=8;//Number of rows in the pyramid
	
	// first loop controls the rows
	/*
	 * Purpose: This loop controls how many rows will be printed.
	 * How it works: i starts from 0 and increments until i < rows (i.e., i = 7 for rows = 8).
	 * Effect: Ensures the pyramid has 8 rows.
	 */
	for(int i=0; i<rows;i++) {
		/*
		 * Purpose: Prints leading spaces to align numbers in the pyramid.
		 * How it works: j starts from 0 and runs until j < rows - i - 1.
		 * Effect: As i increases, the number of spaces decreases.
		 */
		for(int j=0; j<rows -i-1;j++) {
			System.out.println(" ");
		}
		
	
	//Third loop prints the left side of the pyramid
		/*
		 * Purpose: Prints the first half of the pyramid (1, 2, 4, 8…).
		 * How it works: j starts from 0 and runs until j <= i.
		 * Effect: In each iteration, num is multiplied by 2, creating the sequence.
          1248
		 */
	int num=1;
	for(int j=0; j<=i;j++) {
		System.out.println(num + " ");
		num*=2;
	}
	//Fourth Loop (Prints the Right Side of the Pyramid)
	/*
	 *Purpose: Prints the second half of the pyramid (mirroring the left side). 
	 *num /= 2; before the loop ensures the highest number is not repeated.
	 *Loop starts from i - 1 and decrements back to 0.
	 *num /= 2; halves num in each iteration.
	 */
	
	num /= 2;
    for (int j = i - 1; j >= 0; j--) {
        num /= 2;
        System.out.print(num + " ");
    }
    // Move to the next Line
    System.out.println();

	
}
}
}