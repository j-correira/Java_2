package designPatterns_Quest_4;

import java.util.Date;

public class SingletonLogger {

	private boolean empty;
	private boolean logged;
	Date desc;

	
	private static SingletonLogger uniqueInstance;
	
	
	private SingletonLogger() {
		empty = true;
		logged = false;	
	}
	
	
	public static SingletonLogger getInstance() {	
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonLogger();
		}	
		return uniqueInstance;		
	}
	
	
	public boolean isEmpty() {
		return empty;
	}
	
	public void emptyLog() {
		empty = true;
	}
	
	
	public void log() {
		if (!isEmpty()) {
			empty = false;
			logged = true;
			//this.desc = new Date();	
		}
	}
	
	
	/*
	public void getDesc() {
		System.out.println(this.desc_s);
	}
	*/
	
}
