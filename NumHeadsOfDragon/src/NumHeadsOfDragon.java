/**
 * NumHeadsOfDragon
 *  Program have to find number of n-aged dragon. if n<200  it has grown 3 heads,
 *  per each year, then since 200 to 299 years it has grown 2 heads per year, and 
 *  since 300 years and over it has grown 1 head per year.Calculate also a number of eyes
 *  for the age.
 *
 * Version 1.0(v1.1 -18.05.19)
 *
 * Date 06.05.2019
 *
 * Writen by denisgossa doitnow@tut.by
 */
import java.util.Scanner;

public class NumHeadsOfDragon {
	private final int EYESPERHEAD=2;
	private int age;
	private int countOfEyes;
	private int countOfHeads;
	
	/*constructor and initialization*/
	public NumHeadsOfDragon(){
		countOfHeads=3;
		countOfEyes=6;
	}
	
	private void setAge() {
		age=getInt();
	}
	private void calculateCountOfEyesForAllHeads(int countheads) {
		if(EYESPERHEAD==2){
			countOfEyes=countheads<<1;
		}
		else {
			countOfEyes=countheads*EYESPERHEAD;
		}
	}
	
	private int getAge() {
		return age;
	}
	
	
	private int getcountOfEyes() {
		return countOfEyes;
	
	}
	
	private static int getInt() {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
		    System.out.print("Enter an AGE of a Dragon (positive number):");
		    while (!sc.hasNextInt()) {
		        System.out.print("That's not a number!Try again:");
		        sc.next(); // this is important!
		    }
		    number = sc.nextInt();
		} while (number <= 0);
		System.out.println("Thank you! Got " + number);
		return number;
		
	}
	
	/*Fuction of finding count of headers */
	private int findNumOfHeadsOfDragon() {
		
		int tmp=countOfHeads;
	
		if(age<200) {
			for(int i =1;i<=age;i++){tmp+=3;}
			
		}
		if(200<=age&&age<300){
			tmp=3*199+3;
			for(int j =200;j<=age;j++){tmp+=2;}
			
			}
		if(300<=age){
			tmp=3*199+3+100*2;
			for(int i =300;i<=age;i++){tmp+=1;}
			}
		
		

		calculateCountOfEyesForAllHeads(tmp);
	return tmp;	
		
	}
		
	
	
	public static void main(String[] args) {
		
		NumHeadsOfDragon dragon=new NumHeadsOfDragon();
		
		dragon.setAge();
		System.out.println("Age:"+dragon.getAge());
		
		System.out.println("COUNT OF HEADS:"+dragon.findNumOfHeadsOfDragon());
		System.out.println("COUNT OF Eyes:"+dragon.getcountOfEyes());
		
	}

}
