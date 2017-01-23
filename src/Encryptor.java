//Implementation of the Caesar Cipher
public class Encryptor {
	public static String encrypt(String plaintext, int shift){
		String cipherText = "";
		for(char c : plaintext.toUpperCase().toCharArray()){
			if(Character.isLetter(c)){
				cipherText += (char) (65  + ((c-65) + shift) %26);
				//System.out.println(cipherText + ": " + (65  + ((c-65) + shift)%26));
			}else{
				cipherText += (char) c;
			}
		}
		
		return cipherText; 
	}
	
	public static String decrypt(String ciphertext, int shift){
		String plainText = "";
		for(char c : ciphertext.toUpperCase().toCharArray()){
			if(Character.isLetter(c)){
				plainText += (char) (65  + ((c-65) - shift + 26) %26);
				//System.out.println(plainText + ": " + (65  + ((c-65) + shift)%26));
			}else{
				plainText += (char) c;
			}
		}
		
		return plainText; 
	}
}
