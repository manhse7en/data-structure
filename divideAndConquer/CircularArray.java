package divideAndConquer;

public class CircularArray {

	public static int circularArraySearch(int[] A, int x) {
		int left = 0;
		int right = A.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (x == A[mid]) {
				return mid;
			}
			if (A[mid] <= A[right]) {
				if (x > A[mid] && x <= A[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			} else {
				if (x >= A[left] && x < A[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] A = { 7, 8, 9, 10, 1, 2 };
		int key = 1;
		int index = circularArraySearch(A, key);
		if (index != -1) {
			System.out.println("Element found at index " + index);
		} else {
			System.out.println("Element not found in the array");
		}
	}
}
