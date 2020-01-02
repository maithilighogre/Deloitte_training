package lab6;
import java.util.*;
public class StrToken {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		String input=sc.nextLine();
		StringTokenizer st=new StringTokenizer(input,",");
		int sum=0;
		while(st.hasMoreTokens()){
			int n=Integer.parseInt(st.nextToken());
			System.out.println(n);
			sum+=n;
		}
		System.out.println("Sum is:"+sum);
		sc.close();
	}
}
