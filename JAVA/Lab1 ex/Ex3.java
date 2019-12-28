package javalab;
import java.util.*;
public class Ex3 {
	public static boolean checkNumber(int number){
		String s=Integer.toString(number);
		boolean flag=false;
		int i=0;
		int l=s.charAt(s.length()-1);
		for(i=0;i<s.length()-1;i++){
				if(s.charAt(i)>s.charAt(i+1)){
					flag=false;
					break;
				}
				else{
					flag=true;
				}
			}
			if(i==l&& flag==true){
				if(s.charAt(l)>s.charAt(l-1)){
					flag=true;
				}
			}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.print(Ex3.checkNumber(number));
	}

}
