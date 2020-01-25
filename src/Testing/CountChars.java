package Testing;

public class CountChars {
	
	public static boolean hasLetter(String word, char letter) {
		
		for (int i = 0; i < word.length(); i++) {
			
			if (word.charAt(i) == letter) {
				return true;
			}
		}
		return false;
	}
	
	public static int returnLetterIndex(String word, char letter) {
		
		for (int i = 0; i < word.length(); i++) {
			
			if (word.charAt(i) == letter) {
				return i;
			}
		}
		return -1;
	}
	
	//replace a char in a string with a given char
	//this example of a loop shows that a for each loop is not the 
	//right choice for editing strings, or arrays
	public static String replace(String word, char gone, char here ) {
		//set string as array of characters
		char[] cArray = word.toCharArray();
		char[] cArrayMod = new char[cArray.length];
		int i = 0;
		//loop over every array **FOR EACH LOOP** 
		for (char c: cArray) {
			//check if char equals the char you want to replace
			if (c == gone) {
				//replace with new char
				cArrayMod[i] = here;
			}else {
				cArrayMod[i] = c;
			}
			i++;
		}
		//return the new string object
		return new String(cArrayMod);
	}

}
