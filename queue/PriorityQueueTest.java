package queue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(6);
		pq.insert("cv1", 5);
		pq.insert("cv2", 3);
		pq.insert("cv3", 1);
		pq.insert("cv4", 2);
		pq.insert("cv5", 4);
		for (int i = 1; i <= pq.size(); i ++)
			System.out.println(pq.heap[i].toString());
		System.out.println("-----");
		while(pq.size() > 0) {
			System.out.println(pq.remove().toString());
		}
	}
}
