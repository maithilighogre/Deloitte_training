package lab6;
import java.io.*;
public class ReadFile {

	public static void main(String args[]) throws IOException{
		int i, line=1,len;
		char k;
		FileInputStream fin=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\try.txt");
		len=fin.available();
		System.out.println(line);
		line++;
		for(i=0;i<=len;i++){
			k=(char)fin.read();
			if(k=='\n'){
				System.out.print(line);
				line++;
			}
			System.out.print(k);
			
		}
		fin.close();
	}
}
