/**
 * Md. Rezwanul Haque
 * Roll : 1407028
 * Dept : CSE
 * University : KUET
 * Batch : 2K14
 * Email : r.haque.249.rh@gmail.com
 *  
 */
package Matrix_Multiplication;

public class Matrixthread {
	private static MatrixThreadClass object = new MatrixThreadClass(3, 3, 3, 3);

	public static void main(String[] args) {
		//MatrixThreadClass object = new MatrixThreadClass(3, 3, 3, 3);
		object.setA();
		object.setB();
		object.Multiplication();
	}
	
	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}

}

/*
Input And Output Sample : 
-------------------------
Enter the First Matrix : 
1 2 3
4 5 6
7 8 9
Enter the Second Matrix : 
1 1 1
2 2 2
3 3 3
Result : 
14 14 14 
32 32 32 
50 50 50 
*/
