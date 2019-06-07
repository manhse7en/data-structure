package queue;

public class PriorityQueue {
	public Task[] heap;
	public int heapSize, capacity;

	public PriorityQueue(int capacity) {
		this.capacity = capacity;
		heap = new Task[this.capacity];
		heapSize = 0;
	}

	public void clear() {
		heap = new Task[capacity];
		heapSize = 0;
	}

	public boolean isEmpty() {
		return heapSize == 0;
	}

	public boolean isFull() {
		return heapSize == capacity - 1;
	}

	public int size() {
		return heapSize;
	}

	public void insert(String job, int priority) {
		Task newJob = new Task(job, priority);
		heap[++heapSize] = newJob;
		int pos = heapSize;
		while (pos != 1 && heap[pos].priority > heap[pos / 2].priority) {
			heap[pos] = heap[pos / 2];
			pos /= 2;
		}
		heap[pos] = newJob;
	}

	public Task remove() {
		int parent, child;
		Task item, temp;
		if (isEmpty()) {
			System.out.println("Heap is empty");
			return null;
		}
		item = heap[1];
		temp = heap[heapSize--];
		parent = 1;
		child = 2;
		while (child <= heapSize) {
			if (child < heapSize && heap[child].priority < heap[child + 1].priority)
				child++;
			if (temp.priority >= heap[child].priority)
				break;

			heap[parent] = heap[child];
			parent = child;
			child *= 2;
		}
		heap[parent] = temp;
		return item;
	}
}
