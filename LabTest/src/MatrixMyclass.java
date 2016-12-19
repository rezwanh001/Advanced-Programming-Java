import javax.print.attribute.Size2DSyntax;

public class MatrixMyclass implements Matrix{
	public int size;
	public static String MatrixArrayX[][];
	public static String MatrixArrayY[][];
	/**
	 * Constructor
	 */
	public MatrixMyclass(int n) {
		size = n;
		MatrixArrayX = new  String [size][size] ;
		MatrixArrayY = new  String [size][size];
	}
	
	public VectorMyclass store_MatrixX_MatrixY(int i, int j){
		VectorMyclass v = new VectorMyclass(2);
		int x = v.getX(1);
		return v;
	}
	
	@Override
	public VectorMyclass addition() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public VectorMyclass mult() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public VectorMyclass dim() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public VectorMyclass transpose() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public VectorMyclass inverse() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * main Function
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void prln(Object object){
		System.out.println(object);
	}
	
	

}
