
public class QueueApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedQueue<String> burgerCustomers = new LinkedQueue<String> ();
		
		burgerCustomers.enqueue("Bill");
		burgerCustomers.enqueue("Alice");
		burgerCustomers.enqueue("Bob");
		
		System.out.println("The following customers are currently in line: ");
		burgerCustomers.print();
		
		System.out.println("---------------------------------");
		System.out.println("A customer is served.");
		burgerCustomers.dequeue();
		burgerCustomers.print();
		
		System.out.println("-----------------------------");
		System.out.println("Jane arrives.");
		burgerCustomers.enqueue("Jane");
		System.out.println("Hamad arrives.");
		burgerCustomers.enqueue("Hamad");
		burgerCustomers.print();
		
		System.out.println("---------------------------");
		System.out.println("Two customers are served.");
		burgerCustomers.dequeue();
		burgerCustomers.dequeue();
		burgerCustomers.print();
		
		System.out.println("--------------------------");
		System.out.println("Jim arrives.");
		burgerCustomers.enqueue("Jim");
		burgerCustomers.print();
		
		System.out.println("---------------------------------");
		System.out.println("Another customer is served.");
		burgerCustomers.dequeue();
		burgerCustomers.print();
		
		System.out.println("------------------------------------");
		System.out.println("Another customer is served.");
		burgerCustomers.dequeue();
		burgerCustomers.print();
	} //end main

} //end QueueApplication
