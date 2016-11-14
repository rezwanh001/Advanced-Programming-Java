
public class ComplexQ {
	private ComplexNumber[] Queue;
	private int rear;
	private int front;
	// Default Constructor
	public ComplexQ() {
		Queue = new ComplexNumber[1000];
		rear = 0;
		front = 0;
	}
	// Parameter Constructor(Initialize Size Of Queue)
	public ComplexQ(int Size) {
		Queue = new ComplexNumber[Size];
		rear = 0;
		front = 0;
	}
	
	public void Insert(ComplexNumber itm){
		Queue[rear++]  = itm;
	}
	public  void Delete(ComplexNumber itm) {
		front++;
	}
	
	public void showQueue(){
		for(int i = front; i< rear; i++){
			Queue[i].printComplexNumber();
		}
	}
		

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
