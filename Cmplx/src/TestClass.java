
public class TestClass {
	ComplexNumber R;
	ComplexNumber Z1;
	ComplexNumber Z2;
	ComplexNumber Z3;
	
	ComplexQ CQ;
	
	public TestClass(){}
	
	public void TestQ() {
		CQ = new ComplexQ(5);
		Z1 = new ComplexNumber(12.0,10.5);
		Z2 = new ComplexNumber(15.5,10.5);
		Z3 = new ComplexNumber(12.0,20.5);
		CQ.Insert(Z1);
		CQ.Insert(Z2);
		CQ.Insert(Z3);
		CQ.showQueue();
		
	}
	
	public void TestRun(){
		Z1 = new ComplexNumber(12.0,10.5);
		Z2 = new ComplexNumber(15.5,10.5);
		Z3 = new ComplexNumber(12.0,20.5);
		
		//R = Z1.printComplexNumber();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Z1 = new ComplexNumber(12.0,10.5);
//		Z2 = new ComplexNumber(15.5,10.5);
//		Z3 = new ComplexNumber(12.0,20.5);
//		
//		R = Z1.printComplexNumber();
		
		TestClass T = new TestClass();
		T.TestRun();
		T.TestQ();

	}
	
	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}

}
