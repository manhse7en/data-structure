package queue;

public class Task {
	String job;
	int priority;

	public Task(String job, int priority) {
		this.job = job;
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Task [job=" + job + ", priority=" + priority + "]";
	}

}
