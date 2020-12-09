package schedule;

import java.util.TimerTask;

public class Task extends TimerTask {
	private final String string;
	private int contador = 0;
	
	public Task(String string) {
		this.string = string;
	}
	
	@Override
	public void run() {
		contador++;
		System.out.println(string + " chamada " + contador);
	}
}
