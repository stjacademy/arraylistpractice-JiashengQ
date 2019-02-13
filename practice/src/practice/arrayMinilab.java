package practice;
import java.util.ArrayList;
public class arrayMinilab {
	public static void main (String[] args) {
	 int number=36;
	 ArrayList <Integer> n = getListOfFactors(number);
	System.out.println(n);
	 keepOnlyCompositeNumbers(getListOfFactors(number));
	 
	}
 public static ArrayList<Integer> getListOfFactors(int number){
	 ArrayList<Integer> numbers=new ArrayList<Integer>();
	 
	 for(int i=2;i<number;i++) {
		 if(number%i==0) {
			 numbers.add(i);
		 }
	 }
	 return numbers;
 }
 
 public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums){
	 for (int i=0;i<nums.size();i++) {
		 if(getListOfFactors(nums.get(i)).size()==0){
			 nums.remove(i);
			 i--;	 
		 }
	 }
	 System.out.println(nums);
 }
}
