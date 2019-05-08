/**
 * There is a current day in [dd mm yy]. Find next day without using java library.
 * take into account of leap years
 *
 * Version 1.0
 *
 * Date 08.05.2019
 *
 * Writen by denisgossa doitnow@tut.by
 */
import java.util.Scanner;
public class NextDayOfCalendar {
	int [] daysOfMonthYear =     {31,28,31,30,31,30,31,31,30,31,30,31};
    int [] daysOfMonthLeapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	int currentyear;//current year
	int currentday;
	int currentmounth;
	
	boolean isleapyear;
	
	private void setCurrentDate() {
		setYear();
		if(isleapyear) {
			System.out.println("Year is a leap ");
		}
		else {System.out.println("Year is NOT a leap ");}
		
		setMounth();
		setDay();
	
	};
	
	
	private void setYear() {
		do {System.out.print("Enter a number(1582 or greater):");
		currentyear=getInt();
		}while(currentyear<1582);
		isThisALeapYear();
	}
	private void setMounth() {
		do {System.out.print("Enter a mounth(1-12):");
		currentmounth=getInt();
		}while(currentmounth<1||currentmounth>12);
		
	}
	private void setDay() {
		boolean correctentering;
		do {
				do {System.out.print("Enter a day:");
				currentday=getInt();
				}while(currentday<1||currentday>31);
		
				if(!isleapyear&&currentday>daysOfMonthYear[currentmounth-1]) {
				System.out.println("Enter correct day ");
				correctentering=false;
				}
		
				else if(isleapyear&&currentday>daysOfMonthLeapYear[currentmounth-1]) {
				System.out.println("day isn't correct ");
				correctentering=false;
				}
				else {correctentering=true;}
		}while(!correctentering);
	}
	
	
	
	public static int getInt() {
		Scanner sc = new Scanner(System.in);
		int number;
				    
		    while (!sc.hasNextInt()) {
		        System.out.print("That's not a number!Try again:");
		        sc.next(); // this is important!
		    }
		    number = sc.nextInt();
			
		return number;
	}
	
	boolean isThisALeapYear() {
		if(currentyear%400==0) {isleapyear=true; return true;}
		if(currentyear%100==0) {isleapyear=false;return false;}
		if(currentyear%4==0) {isleapyear=true;return true;}
		else {isleapyear=false;return false;} 
	};
	
	
	private  boolean isLastDayOfMonth(){
		if(isleapyear&&daysOfMonthLeapYear[currentmounth-1]==currentday) {return true;}
		if(!isleapyear&&daysOfMonthYear[currentmounth-1]==currentday) {return true;}
		return false;
		
	}
	
	
	
	private  boolean isLastMonthOfYear(){
		if(currentmounth==12) {return true;}
		else {return false;}
		
		
	}
	
	
	
	
	
	
	void setNextDay() {
		
		if(isLastMonthOfYear()&&isLastDayOfMonth()) {currentday=1;currentmounth=1;++currentyear;return;}
		if(currentmounth==2&&isLastDayOfMonth()) {currentday=1;++currentmounth;return;}
		if(!isLastMonthOfYear()&&isLastDayOfMonth()) {currentday=1;++currentmounth;return;}
		if(!isLastMonthOfYear()&&!isLastDayOfMonth()) {++currentday;return;}
				
	}
	
	void viewCurrentDate() {
		System.out.println("\nCurrent day:");
		System.out.println("dd"+currentday);
		System.out.println("mm"+currentmounth);
		System.out.println("yy"+currentyear);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextDayOfCalendar tcalendar=new NextDayOfCalendar();
		
		tcalendar.setCurrentDate();
		tcalendar.viewCurrentDate();
		tcalendar.setNextDay();
		tcalendar.viewCurrentDate();
		
		
	}

}
