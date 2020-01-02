package lab6;
import java.util.*;
import java.io.*;
public class FileDetails {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of file: ");
		String fileName=sc.nextLine();
		File fin= new File(fileName);
		System.out.println("If file exists: "+fin.exists());
		System.out.println("If file is readable: "+fin.canRead());
		System.out.println("If file is writable: "+fin.canWrite());
		System.out.println("Size: "+fin.length());
		sc.close();
	}
}
