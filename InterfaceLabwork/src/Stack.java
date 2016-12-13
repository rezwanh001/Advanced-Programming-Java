public class Stack implements Summary, Collection {
	private int maxSize;
	private int[] stackArray;
	private int top;

	public Stack(int s) {
		maxSize = s;
		stackArray = new int[maxSize];
		top = -1;
	}

	public int len() {
		return maxSize;
	}

	public void addItem(int a) {
		stackArray[++top] = a;
	}

	public void removeItem() {
		//int t = top - 1;
		top = top - 1;
	}

	public void sort() {
		int n = top; //stackArray.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (stackArray[j - 1] > stackArray[j]) {
					temp = stackArray[j - 1];
					stackArray[j - 1] = stackArray[j];
					stackArray[j] = temp;
				}
			}
		}
	}
	
	public int search(int item){
		int n = stackArray.length;
		for(int i=0;i<n;i++){
			if(stackArray[i] == item){
				return i;
			}
		}
		return 0;
	}
	
	public int mean(){
		int sm = 0;
		for(int i=0;i<top;i++){
			sm += stackArray[i];
		}
		return sm/top;
	}
	public int median(){
		sort();
		//int l = len();
		return stackArray[top/2];
		
	}
	public int range(){
		sort();
		int highest = stackArray[top - 1];
		int lowest = stackArray[0];
		
		return (highest - lowest);
	}
	
	public void displaySort(){
		int n = top;//stackArray.length;
		for(int i=0;i<n;i++){
			System.out.println(stackArray[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack(6);
		st.addItem(2);
		st.addItem(6);
		st.addItem(4);
		st.addItem(5);
		st.addItem(1);
		//st.addItem(7);
		//st.addItem(1);
		//st.addItem(11);
		st.removeItem();
		//st.removeItem();
		//st.removeItem();
		
		//Range
		System.out.println("Range: " + st.range());
		
		st.sort();
		
		st.displaySort();
		//Mean
		System.out.println("Mean: " + st.mean());
		//Median
		System.out.println("Median : " + st.median());
		

	}

}
