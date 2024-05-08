package JavaCollectionsAdvanced;

public class CircularQueue {
	static int[] data;
	static int front = 0;
	static int end = 0;
	static int size = 0;

	public CircularQueue(int size) {
		this.data = new int[size];
	}

	public boolean insert(int item) {

		if (isFull()) {
			System.out.println("queue is full");
			return false;
		}
		data[end] = item;
		end++;
		end = end % data.length;
		size++;
		return true;

	}

	public int remove() {

		if (isEmpty()) {
			System.out.println("queue is empty");
		}
		int removed = data[front];
		front++;
		front = front % data.length;
		size--;
		return removed;

	}

	public void display() {
		int i = front;
		do {
			System.out.print(data[i] + " -> ");
			i++;
			i = i % data.length;

		} while (i != end);
		System.out.print("END");

	}

	public static boolean isFull() {
		return size == data.length;
	}

	public static boolean isEmpty() {
		return end == 0;
	}

}
