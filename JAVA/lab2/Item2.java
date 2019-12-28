package lab2;
import java.util.*;
public class Item2 {
		public static void main(String args[])
		{
			Item[] items=new Item[4];
			items[0]=new Book(12,"Alchemist", 200, "paul coleo");
			items[1]=new JournalPaper(81, "The need for cyber security", 300, "Nirnay", 2017);
			items[2]=new Video(21, "java", 250, 50, "sumit", "learning", 2018);
			items[3]=new CD(41, "win Xp BOOT", 40, 0, "Microsoft", "operating systems");
			
			Item j;
			for(int i=0;i<4;i++)
			{
				j=items[i];
				System.out.println(j.toString()+"\n");
			}
			
		}
}
