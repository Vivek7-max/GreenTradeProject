package practice;

public class DeadLock {
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();
	}
}
