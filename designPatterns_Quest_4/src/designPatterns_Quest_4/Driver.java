package designPatterns_Quest_4;

import java.util.Date;

public class Driver {

		public static void main (String[] args) {
			
			SingletonLogger sl = SingletonLogger.getInstance();
			
			sl.log();
			sl.emptyLog();
			
			//sl.getDesc();
					
			System.out.println("SL   memory address: " + sl.toString());
			
			
			SingletonLogger sl_2 = SingletonLogger.getInstance();
			sl_2.log();
			System.out.println("SL_2 memory address: " + sl_2.toString());
			
			
			SingletonLogger sl_3 = SingletonLogger.getInstance();
			sl_3.log();
			sl_3.log();
			sl_3.log();
			System.out.println("SL_3 memory address: " + sl_3.toString());
						
		}
	
}
