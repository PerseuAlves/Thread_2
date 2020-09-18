package controller;

public class ThreadId extends Thread {
	
	public ThreadId () {
		super();
	}
	
	public void run () {
		
		System.out.println(getId());
	}
}
