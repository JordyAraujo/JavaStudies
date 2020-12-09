package schedule;

import java.util.Timer;

public class TesteSchedule {
	public static void main(String[] args) {
		Timer timer = new Timer();
		
		timer.schedule(new Task("Task1"),  2000);;
		
		for(int i = 0; i < 100; i++) {
			timer.schedule(new Task("Task " + i),  1000, 5000);
		}
	}
}