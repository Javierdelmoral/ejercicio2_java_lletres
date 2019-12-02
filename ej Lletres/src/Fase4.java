import java.util.*;



public class Fase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> Name = new ArrayList<Character>();
				
		String nom = "Javier ";

		for(char c : nom.toUpperCase().toCharArray()) {
			
			Name.add(c);
				
		}
		
	
		//Crear otra lista con mi apellido donde cada posición corresponda a una letra
		
		List<Character> Surname = new ArrayList<Character>();
				
		String surName = "del Moral Asensio";
		
		for(char s : surName.toUpperCase().toCharArray()) {
			
			Surname.add(s);
							
		}
		
		
		//Unir ambas listas en fullName

		List<Character> fullName = new ArrayList<Character>();
		
			fullName.addAll(Name);
			fullName.addAll(Surname);
			
			
		System.out.println(fullName);
		

	}

}
		



