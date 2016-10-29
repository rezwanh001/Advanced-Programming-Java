package Matrix_Multiplication;

import java.util.Scanner;

public class MatrixThreadClass extends Thread {
	static Scanner sc = new Scanner(System.in);
	private int row1;
	private int col1;
	private int row2;
	private int col2;

	private int[][] A;
	private int[][] B;

	int[][] result;

	public Object thread1;
	public Thread thread2;
	public Thread thread3;

	// ------- Constructor ----------
	public MatrixThreadClass(int row1, int col1, int row2, int col2) {
		super();
		this.row1 = row1;
		this.col1 = col1;
		this.row2 = row2;
		this.col2 = col2;

		A = new int[row1][col1];
		B = new int[row2][col2];

		result = new int[row1][col2];

	}

	// ----- Getters and Setters---------

	public void setA() {
		pr("Enter the First Matrix : \n");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				A[i][j] = sc.nextInt();
			}
		}
	}

	public void setB() {
		pr("Enter the Second Matrix : \n");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				B[i][j] = sc.nextInt();
			}
		}
	}

	public int getRow1() {
		return row1;
	}

	public void setRow1(int row1) {
		this.row1 = row1;
	}

	public int getCol1() {
		return col1;
	}

	public void setCol1(int col1) {
		this.col1 = col1;
	}

	public int getRow2() {
		return row2;
	}

	public void setRow2(int row2) {
		this.row2 = row2;
	}

	public int getCol2() {
		return col2;
	}

	public void setCol2(int col2) {
		this.col2 = col2;
	}

	public int[][] getA() {
		return A;
	}

	public int[][] getB() {
		return B;
	}

	// ------Multiplication of Two Matrices----------
	public void Multiplication() {
		Thread thread1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < col2; i++) {
					for (int j = 0; j < col1; j++) {
						result[0][i] += A[0][j] * B[j][i];
					}
				}

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < col2; i++) {
					for (int j = 0; j < col1; j++) {
						result[1][i] += A[1][j] * B[j][i];
					}
				}

			}
		});

		Thread thread3 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < col2; i++) {
					for (int j = 0; j < col1; j++) {
						result[2][i] += A[2][j] * B[j][i];
					}
				}

			}
		});
		//-------Result of Matrix---------------
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			pr("Result : \n");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col2; j++) {
					pr(result[i][j] + " ");
				}
				pr("\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	static void pr(Object anyObject) {
		System.out.print(anyObject);
	}

}
