
package practice;
import java.util.ArrayList;
public class notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[]  grades=new int[2];
		
		grades[0]=73;
		grades[1]=92;
		
		for(int i=0;i<grades.length; i++)			
		System.out.println(grades[i]);
		*/
		// ArrayList [] XXXXX NEVER
		ArrayList<String> grades=new ArrayList<String>(); 
	    
		grades.add("Paul");
		grades.add("pete");
		grades.add("John");
		grades.add("George");
		//grades.remove(1);
		grades.add(1,"Ringo");
		//grades.add("Christine");
		//String removed=(String)grades.remove(grades.size()-1);
		System.out.println("Band: " + grades);
		System.out.println("Size of the band: "+ grades.size());
		/*grades.add(grades.remove(2));
		grades.add(0,grades.get(4));
		
		grades.set(2, "Christine");*/
		
		//System.out.println(removed);
		
		/*System.out.println(grades);
	    //System.out.println("I removed the "+ grades.remove(2));
	    grades.add(1, 99);
	    
	    System.out.println(grades);
	    
	   grades.set(3,78);
	   System.out.println(grades);
	   
	   for (int i=0; i<grades.size();i++) {
		   System.out.println(grades.get(i));
	   }
	   for (Integer num:grades)
		   System.out.println(num);
	   grades.remove(grades.get(0));
	   // never remove in a for-each loop */
	   
	}

}
