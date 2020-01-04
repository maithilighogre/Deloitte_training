import java.util.*;
public class Count {
		static char arr[]=new char[8];
		static Scanner sc=new Scanner(System.in);
		public static Map<Character,Integer> CountCharacter( ){
			Map<Character, Integer> charCountMap  = new HashMap<Character, Integer>();
			for (char c : arr) { 
	            if (charCountMap.containsKey(c)) { 
	                charCountMap.put(c, charCountMap.get(c) + 1); 
	            } 
	            else { 
	                charCountMap.put(c, 1); 
	            } 
	        } 
	  
	        for (Map.Entry entry : charCountMap.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 
			return charCountMap;
		}
		
		public static void getArrayCount()
		{
			System.out.println("Enter the string");
			
			for(int i=0;i<8;i++)
			{
				arr[i]=sc.next().charAt(0);
			}
			
		}
		
		public static void main(String[] args){
			Map<Character, Integer> map  = new HashMap<Character, Integer>();
			getArrayCount();
			map=CountCharacter();
		}
}
