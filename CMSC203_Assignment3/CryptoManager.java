
public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		//throw new RuntimeException("method not implemented");
		boolean bound = true;
	    for (int count = 0; count < plainText.length(); count++) {//convert the string into char to check if it is within the domain
	        if (!(plainText.charAt(count) >= LOWER_BOUND && plainText.charAt(count) <= UPPER_BOUND))
	               bound = false;
	    }
	    return bound; //return if all characters are within the allowable bounds, false if any character is outside.
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		
		//throw new RuntimeException("method not implemented");
		String caesarCipher = "";
		
		for (int count = 0; count < plainText.length(); count++) {
			char c = plainText.charAt(count); //converts each character from the string into char format then adding to key
		    int encrypted = ((int) c + key);// convert to int
		       
		       while (encrypted > UPPER_BOUND) { //wrap around loop if encryptedC is greater than the upper bound
		    	   encrypted -= RANGE;
		               }
		       caesarCipher += (char)encrypted; //add the char to string
		   }
		
		       return caesarCipher;
		
    }
	
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		//throw new RuntimeException("method not implemented");
		String key = "";

        String bellasoCipher = "";

        

        
        int num = 0;

        while(key.length() != plainText.length()) {// match the key length to the plainText length 
        
            key = key + bellasoStr.charAt(num);          

            num++;

            if(num == bellasoStr.length()) {
            	num = 0;
            }

        }


        for(int count = 0; count < plainText.length(); count++) {//Encrypt each character in the plain text


            int equals = plainText.charAt(count) + key.charAt(count); //replace each character in the plainText with key

            if(equals > UPPER_BOUND) {      // if the variable is not in the range then trigger while loop           

                 while(equals > UPPER_BOUND) // subtract the range from the variable until the range is from 95-32

                	 equals = equals - RANGE; 

            }        

            bellasoCipher = bellasoCipher + (char)equals; // add the character to the string

        }

        return bellasoCipher;
		
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		//throw new RuntimeException("method not implemented");

		String decryptedCaesar = "";
		
		for (int i = 0; i < encryptedText.length(); i++) {//inverse of the encryptCaesar
			char c = encryptedText.charAt(i);
		    int decrypted = ((int) c - key); //convert to int
		    
		    while (decrypted < LOWER_BOUND) {//wrap around if less than the lower bound
		    	decrypted += RANGE;
		    }
		    decryptedCaesar += (char)decrypted;//convert to char and add to string
		}
		return decryptedCaesar;
		
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		//throw new RuntimeException("method not implemented");
		String key = "";

        String decryptedBellaso = "";
        
        int num = 0;

       

        while(key.length() != encryptedText.length()){ // match the key length to the plainText length

            key = key + bellasoStr.charAt(num);          

            num++;

            if(num == bellasoStr.length()) {

                 num = 0;
            }
        }

        for(int index = 0; index < encryptedText.length(); index++) {//inverse of the encryptBellaso
        	
            int equals = encryptedText.charAt(index) - key.charAt(index);

            if(equals < LOWER_BOUND){
            	
            	while(equals < LOWER_BOUND) {
            		equals = (equals + RANGE);
            	}

            }            

            decryptedBellaso = (decryptedBellaso + (char)equals);

        }

        return decryptedBellaso;
	}
}
