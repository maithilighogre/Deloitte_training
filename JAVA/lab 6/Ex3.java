package lab6;
import java.util.*;
import java.io.*;
public class NoOfChar {
	public static void main(String args[])throws IOException{
		int line=0,word=0;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of file: ");
		String fileName=sc.nextLine();
		FileInputStream fin= new FileInputStream(fileName);
		int n=fin.available();
		for(int i=0;i<n;i++){
			ch=(char)fin.read();
			if(ch=='\n')
				line++;
			else if(ch==' ')
				word++;
		}
		System.out.println("No of characers: "+n);
		System.out.println("No of words: "+word);
		System.out.println("No of lines: "+line);
		sc.close();
		fin.close();
	}

}
