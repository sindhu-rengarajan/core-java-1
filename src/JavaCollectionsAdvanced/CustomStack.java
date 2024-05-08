package JavaCollectionsAdvanced;

public class CustomStack {

	static int[] data;
	private static final int DEFAULT_SIZE = 10;
	static int i = 0;

	public CustomStack() {
		this(DEFAULT_SIZE);

	}

	public CustomStack(int size) {
		this.data = new int[size];

	}

	public static boolean push(int item) {

		if (isFull()) {
			System.out.println("stack is full");
			return false;
		}
		data[i] = item;
		i++;
		return true;

	}

	public static int pop() throws StackException {
		if (isEmpty()) {
			throw new StackException("cannot pop from empty stack");
		}
		return data[i--];
	}

	public static int peek() throws StackException {
		if (isEmpty()) {
			throw new StackException("cannot pop from empty stack");
		}
		return data[i];
	}

	public static boolean isFull() {
		return i == data.length;

	}

	public static boolean isEmpty() {
		return i == 0;

	}

}
