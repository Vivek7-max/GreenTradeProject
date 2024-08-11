package practice;

public class DeadLock2 {

	public static void main(String[] args) {
		String s1 = "Vivek";
		String s2 = "Vikas";
		
		Thread t1 = new Thread(){
			public void run() {
				synchronized(s1) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {}
				}
				synchronized(s2) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (s2) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {}
				}
				synchronized(s1) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {}
				}
			}
		};

	}

}
