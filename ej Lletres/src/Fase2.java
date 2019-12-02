import java.util.*;

public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nom = "Javier del Moral Asensio";
		List<Character> charsName = new ArrayList<Character>();
		
		for(char c : nom.toLowerCase().toCharArray()) {
			
				charsName.add(c);
				char lastChar = charsName.get(charsName.size()-1);
			
								
			if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
				
				System.out.println("VOCAL");
				
			} else if ((c == '0') || (c == '1') || (c == '2') || (c == '3') || (c == '4') || (c == '5')
					  ||(c == '6') || (c == '7') || (c == '8') || (c == '9')) {
			
				System.out.println("Els noms de les persones no contenen números!");
				
			} else if ((c == ' ')) {
				
				System.out.println("Espai en blanc");
				
			} else {
				
				System.out.println("CONSONANT");
				
			
						
		}
		
		System.out.println(lastChar);
		
		
		
		}

	}
}
