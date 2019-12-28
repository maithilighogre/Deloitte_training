package javalab;
import java.util.*;

public class Ex4 {
	
	public static boolean checkNumber(int n){
		if (n == 0) 
            return false; 
          
        while (n != 1) 
        { 
            if (n % 2 != 0) 
                return false; 
            n = n / 2; 
        } 
        return true; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Ex4.checkNumber(n));
	}

}
