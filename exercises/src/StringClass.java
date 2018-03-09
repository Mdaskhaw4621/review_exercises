
public class StringClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = ("This is a String of the JAVA");
		String xyz = new String ("This is a String of the JAVA");
		
		if(str == xyz) System.out.println("Equal");
		else System.out.println("Different");
		
		if(str.equals(xyz)){
			//correct form for compare the content of Strings
		}
		
		System.out.println("Lenght of String: " + str.length());
		System.out.println("SubString: " + str.substring(0, 10));
		System.out.println("Character in position 5: " + str.charAt(5));
		
		//The method split smash a String in others 
		String[] word = str.split("");
		
		int i = str.indexOf("a"); //return the index of word in String
		
		if(str.startsWith("Hello") || str.endsWith("Word!")){
			//test the start and final of the String - return boolean
		}
		
		str = str.trim(); //remove the space in blank at the start and final
		
		str = str.replace('a', '@'); //replace the characters
		
		//replace a word (uses regular expressions
		str = str.replaceAll("String", "Chain of characters");
	}

}
