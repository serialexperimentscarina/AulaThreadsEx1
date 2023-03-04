package controller;

public class ThreadNumero extends Thread{
	
	public ThreadNumero() {
		super();
	}

	// Imprime no console o PID da Thread
	@Override
	public void run() {
		int pid = (int) getId();
		System.out.println("Thread #" + pid);
	}
	
}
