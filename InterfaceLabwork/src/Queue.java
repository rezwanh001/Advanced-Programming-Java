import java.util.NoSuchElementException;

public class Queue implements Summary, Collection {
	private int queue[];
	private int front, rear, size, len;

	public Queue(int n) {
		size = n;
		len = 0;
		queue = new int[size];
		front = -1;
		rear = -1;
	}

	public int len() {
		return len;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public void addItem(int a) {
		if (rear == -1) {
			front = 0;
			rear = 0;
			queue[rear] = a;
		} else if (rear + 1 >= size) {
			throw new IndexOutOfBoundsException("Overflow Exception");
		} else if (rear + 1 < size) {
			queue[++rear] = a;
		}
		len++;
	}

	public void removeItem() {
		if (isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		} else {
			len--;
			int elem = queue[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
			//return elem;
		}
	}
	
	public void sort() {
		//int n = top; //stackArray.length;
		int temp = 0;
		for (int i = front; i < rear; i++) {
			for (int j = 1; j < (rear - i); j++) {
				if (queue[j - 1] > queue[j]) {
					temp = queue[j - 1];
					queue[j - 1] = queue[j];
					queue[j] = temp;
				}
			}
		}
	}
	
	public int search(int item){
		int n = queue.length;
		for(int i=0;i<n;i++){
			if(queue[i] == item){
				return i;
			}
		}
		return 0;
	}
	
	public int mean(){
		int sm = 0;
		for(int i=front;i<rear;i++){
			sm += queue[i];
		}
		return sm/Math.abs(front - rear);
	}
	public int median(){
		sort();
		//int l = len();
		return queue[Math.abs(front - rear)/2];
		
	}
	public int range(){
		sort();
		int highest = queue[rear - 1];
		int lowest = queue[0];
		
		return (highest - lowest);
	}

	public void display() {
		System.out.println("Queue = ");
		if (len == 0) {
			System.out.println("Empty");
			return;
		}
		for (int i = front; i <= rear; i++) {
			System.out.println(queue[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(6);

		q.addItem(5);
		q.addItem(6);
		q.addItem(7);
		
		q.removeItem();

		q.display();
		
		System.out.println(q.mean());

	}


}
