import java.util.*;

public class Fase3_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a Map to save keys and values as char/int
		
		HashMap <Character, Integer> lhmap = new LinkedHashMap<Character, Integer>();
		
			String nom = "Javier del Moral Asensio";
			char[] myName= nom.toLowerCase().toCharArray();
		
		//for loop to check characters one by one and sum it if are repeated
				
			for(int c=0; c < nom.length(); c++) {
			
				int value=1;
		
		//if the char is new store it
				
				if(lhmap.containsKey(myName[c]) == false) {
					lhmap.put(myName[c], value);
					
		//if is not +1 to the original char
					
				} else {
					value = lhmap.get(myName[c]);
					lhmap.put(myName[c], value+1);
				}
				
				
			}
		
		System.out.println(lhmap);		

	}

}
