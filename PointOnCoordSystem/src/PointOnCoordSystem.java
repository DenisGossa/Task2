/**
 * PointOnCoordSystem - Entering "x coordinate" and "y coordinate"  of 3 Points.
 * Check if they are tops of a triange, and if are check is the  right-angled triangle
 *
 * Version 1.1
 *
 * Date 07.05.2019 (v1.1-18.05.19)
 *
 * Writen by denisgossa doitnow@tut.by
 */
import java.util.Scanner;

public class PointOnCoordSystem {
	double x,y; //coord of point onto the ground
	private static char top='A';
	
	private void setXY() {
		System.out.print("Enter coordinats for Point "+(top++)+": ");
		System.out.print("\nx>>:");
		x=getDouble();
		System.out.print("\ny>>:");
		y=getDouble();
			};
		
			/*Entering of number of int type from console*/
			public static double getDouble() {
				
				Scanner sc = new Scanner(System.in);
				double number;
				
				    while (!sc.hasNextDouble()) {
				        System.out.print("That's not a number!Try again:");
				        sc.next(); // this is important!
				    }
				    number = sc.nextDouble();
				
				return number;
				
			}	
	
	
	private double mySquare(double t) {
		return t*t;
	}
	private double distance(PointOnCoordSystem a, PointOnCoordSystem b) {
		return Math.pow((mySquare(a.x - b.x) + mySquare(a.y - b.y)),(double)1/2); 
	}
	
	private boolean isPointsofTriangle(PointOnCoordSystem a, PointOnCoordSystem b, PointOnCoordSystem c){
	    double distAB,distBC,distAC;
		distAB=distance(a, b);
		distBC=distance(c, b);
		distAC=distance(a, c);
		
		if(distAB + distAC <= distBC){
			return false;
		}
	    	if(distAB + distBC <= distAC){
			return false;
		}
	    	if(distBC + distAC <= distAB){
			return false;
		}
	    	else {
			return true;
		}
	}
	
	
	private boolean isRightAngledTriangle(PointOnCoordSystem a, PointOnCoordSystem b, PointOnCoordSystem c) {
		double ab,ac,bc,abSqr,acSqr,bcSqr;
		ab=distance(a, b);
		ac=distance(a, c);
		bc=distance(b, c);
		abSqr=ab*ab;
		acSqr=ac*ac;
		bcSqr=bc*bc;
		if(abSqr+bcSqr==acSqr) {
			System.out.print("Corner B ");
			return true;
		}
		if(abSqr+acSqr==bcSqr) {
			System.out.print("Corner A ");
			return true;
		}
		if(acSqr+bcSqr==abSqr) {
			System.out.print("Corner C ");
			return true;
		}
		else {
			return false;
		}
	} 
	
	
	
    public static void main(String[] args) {
    	PointOnCoordSystem a=new PointOnCoordSystem();
    	PointOnCoordSystem b=new PointOnCoordSystem();
    	PointOnCoordSystem c=new PointOnCoordSystem();
    	PointOnCoordSystem setspoints=new PointOnCoordSystem();
       a.setXY();
       b.setXY();
       c.setXY();
       
       if(setspoints.isPointsofTriangle(a,b,c)) {
    	   System.out.println("The points are tops of the Triangle");
    	   if(setspoints.isRightAngledTriangle(a,b,c)) {
    		   System.out.println("is right angled in the Triangle");
    	   }
    	   else {
		   System.out.println("Triangle is not a right angled");
	   }
       
       }
       else {
	       System.out.println("Not a triangle ");
       };
       

    }
    
}
