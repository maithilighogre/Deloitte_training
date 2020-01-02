package lab6;
import java.util.*;
public class PositiveString {
	public static void CheckString(String s){
		int flag=0;
		for(int i=0;i<s.length();i++){
			for(int j=0;j<i;j++){
				if(s.charAt(i)>=s.charAt(j)){
					flag=1;;
				}
				else {
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
			System.out.print(true);
		else
			System.out.print(false);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		PositiveString.CheckString(s);
		sc.close();
	}
}
