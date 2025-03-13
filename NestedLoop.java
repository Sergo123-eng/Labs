
public class NestedLoop {

	public static void main(String[] args) {
		
		    
		        int rows = 8; // Number of rows in the pyramid
		        
		        for (int i = 0; i < rows; i++) {
		            // Print leading spaces to shift rows to the right
		            for (int j = 0; j < rows - i + 1; j++) {
		                System.out.print("  ");
		            }
		            
		            // Print increasing part of the pattern
		            int num = 1;
		            for (int j = 0; j <= i; j++) {
		                System.out.print(num + " ");
		                num *= 2;
		            }
		            
		            // Print decreasing part of the pattern
		            num /= 2;
		            for (int j = i - 1; j >= 0; j--) {
		                num /= 2;
		                System.out.print(num + " ");
		            }
		            
		            // Move to the next line
		            System.out.println();
		        }
		        /***
		         * // this code is incorrect you was trying to print 6 power 6
		        System.out.println();
		        System.out.println("---------------------------------");
		        int num=6;
		        for(int i=0;i>=num;i*=6) {
		        	num*=6;
		        	System.out.println(num);
		        }
		        System.out.println();
		        // the corrected code
		        
		        int number=6;
		        int result=1;
		        for(int i=0;i<6;i++) {
		        	result*=number;
		        	System.out.println("6^" + i + " = " + result);
		        }
		         */
		        
		        }
		    }
		


	


