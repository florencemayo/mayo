package main;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {

	//Animal loses/gets new friendship every 7am, 
	//once per day
	private final static long ONCE_PER_DAY = 1000*60*60*24;
	
	private final static int SEVEN_AM = 7;
	
	private final static int ZERO_MINUTES=0;
	
	public MyTask() {}
	
	
	@Override
	public void run() {
		//gets the current time
		long currentTime = System.currentTimeMillis();
		//two hours range for the instruction to be executed.
		long stopTime = currentTime+2000;
		while (stopTime != System.currentTimeMillis()){
			
			//Lose a new friend
			
			//Establish new friendship a new friendship
		}
	}
	
	private Date getTimeToDoTask(){
		Calendar calender = Calendar.getInstance();
		calender.set(Calendar.HOUR_OF_DAY, SEVEN_AM);
		calender.set(Calendar.MINUTE, ZERO_MINUTES);
		calender.set(Calendar.SECOND,0);
		calender.set(Calendar.MILLISECOND, 0);
		
		Date date7am = calender.getTime();
		return date7am;
	}
	
	private void startTask(){
		MyTask task = new MyTask();
		Timer timer = new Timer();
		timer.schedule(task, getTimeToDoTask(),ONCE_PER_DAY);
	}
}
