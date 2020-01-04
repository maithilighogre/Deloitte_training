import java.util.*;
public class Hash {
	
	public Hash(){
		
	}
	public static void main(String[] args){
		Map <Integer,String> map =new HashMap<>();
		map.put(1,"qwe");
		map.put(3,"cye");
		map.put(2,"mne");
		
		System.out.println(getValues(map));
	}
	public static ArrayList getValues(Map<Integer,String>m){
		ArrayList l=new ArrayList<String>();
		for(Map.Entry<Integer, String> e : m.entrySet() ){
			l.add(e.getValue());
		}
		Collections.sort(l);
		return l;
	}
}
