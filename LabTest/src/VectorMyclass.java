
public class VectorMyclass implements Vector{
	public static String[][] MatrixArrayX ;
	public int vectorArr_x[];//store x value
	public int vectorArr_y[];//store y value 
	public int size, len ,i,j;
	/**
	 * Constructor
	 */
	public VectorMyclass(int n){
		size = n;
		len = 0;
		vectorArr_x = new int [size];
		vectorArr_y = new int [size];
		
		MatrixArrayX = new String[size][size];
		i = 0;
		j = 0;
		
	}
	/**
	 * 
	 * @param x = value of x direction of vector
	 * @param y = value of y direction of vector
	 */
	public void passPara(int x, int y){
		//int i = 0, j = 0;
		vectorArr_x[ i++ ] = x; // push x
		vectorArr_y[ j++ ] = y; // push y
		len += 1;
		
	}
	/**
	 * 
	 * @param i = vector of index i
	 * @param j = vector of index j
	 */
	public void product(int i, int j){
		int x1 = vectorArr_x[i - 1];
		int x2 = vectorArr_x[j - 1];
		
		int y1 = vectorArr_y[i - 1];
		int y2 = vectorArr_y[j - 1];
		
		int X = x1*x2;
		int Y = y1*y2;
		prln(X + "i + " + Y + "j");
	}
	/**
	 * magnitude of a vector
	 */
	@Override
	public double magnitude(int i) {
		int x = vectorArr_x[i - 1];
		int y = vectorArr_y[i - 1];
		int ans = (x*x) + (y*y);
		return Math.sqrt(ans);
	}
	/**
	 * theta of a vector
	 */
	@Override
	public double theta(int i) {
		int x = vectorArr_x[i - 1];
		int y = vectorArr_y[i - 1];
//		prln(x + " " + y);
		
		return Math.toDegrees(Math.atan(x/y));
		
	}
	/**
	 * Length of  vector Array
	 */
	@Override
	public int len() {
		return len;
	}
	/**
	 * Multiplication of ith vector with a
	 */
	@Override
	public void scalarMult(int a, int i) {
		int x = vectorArr_x[i - 1];
		int y = vectorArr_y[i - 1];
		int X = a*x;
		int Y = a*y;
		
		prln("Scalar Multiplication: " + X + "i + " + Y + "j");
		
	}
	public void getVector(int n){
		int cnt = 1;
		prln("Matrix X : ");
		for (int i = 0; i < n; i++) {
			for(int j = 0; j<n;j++){
				String anStringX  = ("" + getX(cnt)).toString();
				String anStringY  = ("" + getY(cnt)).toString();
				
				String xString = anStringX + "i + " + anStringY + "j";
				MatrixArrayX[i][j] = xString ;
				cnt += 1;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j<n;j++){
				String anString  = (getX(cnt) + "i + "+ getY(cnt)).toString();
				//String xString
				pr(MatrixArrayX[i][j] + "   ");
			}
			pr("\n");
		}
	}
	
	/**
	 * Vector show
	 */
	@Override
	public void showVector() {
		prln("Show Vector: " );
		
		for(int i=0;i <len; ++i){
			prln(vectorArr_x[i] + "i + " + vectorArr_y[i] + "j");
		}
		
	}
	
	/**
	 * Get x value 
	 */
	public int getX(int i){
		return vectorArr_x[i - 1];
	}
	
	/**
	 * Get y value 
	 */
	public int getY(int i){
		return vectorArr_x[i - 1];
	}
	
	
	/**
	 * main Function
	 */
	public static void main(String[] args) {
		VectorMyclass vector = new VectorMyclass(5);
		vector.passPara(2, 3);
		vector.passPara(3, 4);
		vector.passPara(4, 5);
		vector.passPara(2, 3);
		
		
		//Product
		vector.product(1, 2);
		//Magnitude
		prln("Magnitude of vectr 2: " + vector.magnitude(2));
		//Theta
		prln("Theta of vectr 1: " + vector.theta(1));
		//Length
		prln("Len of Vector Array : " + vector.len());
		//scaler Multplication
		vector.scalarMult(3, 1);
		//vector show
		vector.showVector();
		//get Matrix :
		vector.getVector(2);
	
	}
	public static void prln(Object object){
		System.out.println(object);
	}
	public static void pr(Object object){
		System.out.print(object);
	}
	

}
