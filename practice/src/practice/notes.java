
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
		ArrayList<Integer> grades=new ArrayList<Integer>(); 
	    
		grades.add(92);
		grades.add(22);
		grades.add(28);
		grades.add(29);
		
		System.out.println(grades);
	    //System.out.println("I removed the "+ grades.remove(2));
	    grades.add(1, 99);
	    
	    System.out.println(grades);
	    
	   grades.set(3,78);
	   System.out.println(grades);
	   
	   for (int i=0; i<grades.size();i++) {
		   System.out.println(grades.get(i));
	   }
	   
	}

}
