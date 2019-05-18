/**
 * VowelLetterInInput
 *  4 METHODS for answer is an input letter vowel or not 
 *
 * Version 1.0 (v 1.1-18.05/19)
 *
 * Date 07.05.2019
 *
 * Writen by denisgossa doitnow@tut.by
 */
import java.util.Scanner;

public class VowelLetterInInput {
	private char ch;
	private static char[] VOWELS ={'a','e','i','o','u'};
	private static String str = "aeiou";
	
	
	
	
	/* Method settering new symbol*/
	
	private void setChar() {
		System.out.print("\nEnter symbol:");
		Scanner sc=new Scanner(System.in);
	
		    ch = sc.nextLine().trim().toLowerCase().charAt(0);
		
		
	}	
	
	
	/*Method1*/
	public static boolean isVowelMeth1(char c) {
		System.out.println("_________________In Method 1");
		  return str.indexOf(c) != -1;
	  }
	
	
	
	/*Method2*/
	public static boolean isVowelMeth2(char c) {
		System.out.println("_________________In Method 2");
	if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
		return true;
	}
	else {
		return false;
	}
	}
	
	
	/*Method3*/
	public static boolean isVowelMeth3(char c) {
		System.out.println("_________________In Method 3");
		
		for(int i=0;i<VOWELS.length;i++) {
			  if(VOWELS[i]==c){
				  return true;
			  }
		 }
		  return false;
	  }
	
	/*Method4*/
	public static boolean isVowelMeth4(char c) {
		System.out.println("_________________In Method 4");
		String tmpstr=""+c;
		  return {
			  tmpstr.matches("^(?i:[aeiouy]).*");
		  }
		  /*  ^-begin of string, 
		   * (?i)-CASE_INSENSITIVE
		   *  [aeiouy]-all vowels
		   *  */
	  }
	
	
	
	
	
	
	public static void main(String[] args) {
		VowelLetterInInput tobj=new VowelLetterInInput();
		
		/*Using method 1*/
		tobj.setChar();
		if(tobj.isVowelMeth1(tobj.ch)) {
			System.out.println(tobj.ch+" isVowel");
		}
		else {
			System.out.println(tobj.ch+" is NOt Vowel");
		}
		
		/*Using method 2*/
		tobj.setChar();
		if(tobj.isVowelMeth2(tobj.ch)) {
			System.out.println(tobj.ch+" isVowel");
		}
		else {
			System.out.println(tobj.ch+" is NOt Vowel");
		}
		
		/*Using  method 3*/
		tobj.setChar();
		if(tobj.isVowelMeth3(tobj.ch)) {
			System.out.println(tobj.ch+" isVowel");
		}
		else {
			System.out.println(tobj.ch+" is NOt Vowel");
		}
		
		/*Using method 4*/
		tobj.setChar();
		if(tobj.isVowelMeth4(tobj.ch)) {
			System.out.println(tobj.ch+" isVowel");
		}
		else {
			System.out.println(tobj.ch+" is NOt Vowel");
		}
		
	}

}
