
public class Tests {
	static final String MSG_SUCCESS = "The original message is the same as the decrypted message.";
	static final String MSG_FAILURE = "The original and decrypted messages do not match.";
	
	public static void main(String[] args) {
		//DemoWindow window = new DemoWindow();
		//window.show();
		TestA();
		TestB();
		TestC();
		TestD();
	}

	//Source: http://www.uebersetzung.at/twister/en.htm
	private static void TestA() {
		String message = "Picky people pick Peter Pan Peanut-Butter, 'tis the peanut-butter picky people pick.";
		String ciphertext;
		String decrypted;
		int shiftSize = 4;

		System.out.println("====================Unit Test A====================");
		System.out.println("Original Plaintext: " + message);
		System.out.println("Ciphertext: " + (ciphertext = Encryptor.encrypt(message, shiftSize)));
		System.out.println("Decrypted Plaintext: " + (decrypted = Encryptor.decrypt(ciphertext, shiftSize)) + "\r\n");
		System.out.println((message.equalsIgnoreCase(decrypted)) ? MSG_SUCCESS : MSG_FAILURE);
		System.out.println("===================================================\r\n");

	}
	
	//Source: http://www.uebersetzung.at/twister/en.htm
	private static void TestB() {
		String message = "There those thousand thinkers were thinking how did the other three thieves go through.";
		String ciphertext;
		String decrypted;
		int shiftSize = 13;

		System.out.println("====================Unit Test B====================");
		System.out.println("Original Plaintext: " + message);
		System.out.println("Ciphertext: " + (ciphertext = Encryptor.encrypt(message, shiftSize)));
		System.out.println("Decrypted Plaintext: " + (decrypted = Encryptor.decrypt(ciphertext, shiftSize)) + "\r\n");
		System.out.println((message.equalsIgnoreCase(decrypted)) ? MSG_SUCCESS : MSG_FAILURE);
		System.out.println("===================================================\r\n");

	}
	
	//Source: https://www.abrahamlincolnonline.org/lincoln/speeches/gettysburg.htm
	private static void TestC() {
		String message = "Four score and seven years ago our fathers brought forth on this continent," + 
				"a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.";
		String ciphertext;
		String decrypted;
		int shiftSize = 8;

		System.out.println("====================Unit Test C====================");
		System.out.println("Original Plaintext: " + message);
		System.out.println("Ciphertext: " + (ciphertext = Encryptor.encrypt(message, shiftSize)));
		System.out.println("Decrypted Plaintext: " + (decrypted = Encryptor.decrypt(ciphertext, shiftSize)) + "\r\n");
		System.out.println((message.equalsIgnoreCase(decrypted)) ? MSG_SUCCESS : MSG_FAILURE);
		System.out.println("===================================================\r\n");

	}

	//http://yhscs.us/advanced/projects/classicalEncryption.php
	private static void TestD() {
		String message = "Your task is to implement a classical encryption technique in the programming language of your choice.";
		String ciphertext;
		String decrypted;
		int shiftSize = 12;

		System.out.println("====================Unit Test D====================");
		System.out.println("Original Plaintext: " + message);
		System.out.println("Ciphertext: " + (ciphertext = Encryptor.encrypt(message, shiftSize)));
		System.out.println("Decrypted Plaintext: " + (decrypted = Encryptor.decrypt(ciphertext, shiftSize)) + "\r\n");
		System.out.println((message.equalsIgnoreCase(decrypted)) ? MSG_SUCCESS : MSG_FAILURE);
		System.out.println("===================================================\r\n");

	}
}
