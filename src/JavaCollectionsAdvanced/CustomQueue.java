package JavaCollectionsAdvanced;

public class CustomQueue {

	static int[] data;
	static int i = 0;

	public CustomQueue(int size) {
		this.data = new int[size];
	}

	public static boolean insert(int item) {

		if (isFull()) {
			System.out.println("stack is full");
			return false;

		}

		data[i] = item;
		i++;
		return true;

	}

	public static int remove() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int removed = data[0];
		for (int j = 1; j < i; j++) {
			data[j - 1] = data[j];
		}
		i--;
		return removed;

	}

	public static void display() {
		for (int j = 0; j < i; j++) {
			System.out.print(data[j] + " <- ");
		}
		System.out.print("END");
	}

	public static int front() {
		return data[0];
	}

	public static boolean isFull() {
		return i == data.length;

	}

	public static boolean isEmpty() {
		return i == 0;

	}

}
