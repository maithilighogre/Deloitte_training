import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Square {
		static int arr[]=new int[8];
		static Scanner sc=new Scanner(System.in);
		public static Map<Integer,Integer> CountCharacter( ){
			Map<Integer, Integer> charCountMap  = new HashMap<Integer, Integer>();
			for (int c : arr) { 
	         
	                charCountMap.put(c, c*c); 
	        } 
	  
	        for (Map.Entry entry : charCountMap.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 
			return charCountMap;
		}
		
		public static void getArrayCount()
		{
			System.out.println("Enter the numbers");
			
			for(int i=0;i<8;i++)
			{
				arr[i]=sc.nextInt();
			}
			
		}
		
		public static void main(String[] args){
			Map<Integer, Integer> map  = new HashMap<Integer, Integer>();
			getArrayCount();
			map=CountCharacter();
		}
}
