package JavaCollectionsAdvanced;

public class StackMain {

	public static void main(String[] args) throws Exception {
//		CustomStack stack = new CustomStack(5);
//		stack.push(10);
//		stack.push(11);
//		stack.push(15);
//		stack.push(1);
//
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());

		CircularQueue queue = new CircularQueue(5);
		queue.insert(1);
		queue.insert(11);
		queue.insert(7);
		queue.insert(90);
		queue.insert(900);
		queue.display();
		System.out.println(queue.remove());
		queue.display();
	}

}
