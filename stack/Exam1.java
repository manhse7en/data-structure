package stack;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBasedStack stack = new ArrayBasedStack(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			System.out.println(stack.pop());
		}
	
	}

}
