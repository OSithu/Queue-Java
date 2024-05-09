package Implementation;

public class QueueApp {
	public static void main(String[] args) {
		
		QueueX theQueue = new QueueX(5);
		
		theQueue.insert(5);
		theQueue.insert(8);
		theQueue.insert(10);
		theQueue.insert(7);
		theQueue.insert(18);
		
		System.out.println("Queue Elements ");
		theQueue.display();

		System.out.println("Before Remove");
		System.out.println("The front value is "+theQueue.peekFront());
		
		System.out.println("After Remove");
		theQueue.remove();
		
		System.out.println("Now front is value "+theQueue.peekFront());
		
	}

}
