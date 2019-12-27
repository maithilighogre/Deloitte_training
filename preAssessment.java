import java.util.*;
import java.lang.*;
public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		Source s=new Source();
		String r1="";
		int n=str.length();
		int v=0,w=1;
		for(int i=n-1;i>=0;i--){
			r1=r1+str.charAt(i);
			char ch=str.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
				v++;
			}
			if(ch==' '){
				w++;
			}
		}
		System.out.println("Reverse: "+r1+"\nVowels: "+v+"\nWords: "+w);
		
	}

}
