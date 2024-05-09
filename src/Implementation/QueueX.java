package Implementation;

public class QueueX {
	
	private int maxSize;
	private int []queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public QueueX(int maxSize) {
		
		this.maxSize = maxSize;
		this.queArray = new int[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
		
	}
	
	public boolean isFull() {
		
		return rear == maxSize -1;
		
	}
	
	public boolean isEmpty() {
		
		return nItems == 0;
		
	}
	
	public void insert(int j) {
	
		if(!(isFull())){
			
			queArray[++rear] = j;
			nItems ++;
		
		}
		else {
			System.out.println("Queue is Full");	
			
		}
		
	}
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -99;
		}
		else {
			nItems --;
			return queArray[front++];
		}
	}
	
	public int peekFront() {
		if(isEmpty()) {
			return -99;	
		}
		else {
			return queArray[front];
		}
	}
	
	public void display() {
	
		for(int i=front;i<=rear;i++) {
			System.out.println(queArray[i]);
		}
		
		if(nItems==0) {
			System.out.println("Queue is Empty");
		}
	}
		


}
