package br.com.weslly.cryptography.cryptor;

import java.util.Arrays;


public class CesarCipher implements EncryptableDecryptableBaisc{
	
	public final int SHIFT = 3;
	
	@Override
	public String encrypt(String text, String... key) {
		
		char[] arrayLetterText = text.toCharArray();
		StringBuilder textEncrypted = new StringBuilder(arrayLetterText.length);
		
		for(int i = 0;i<arrayLetterText.length;i++){
			char letter = Character.toChars(arrayLetterText[i])[0];
			
			if(letter !=' '){
				for(int j = 0;j< SHIFT;j++){
					letter++;
					if(letter > 'z' && Character.isLowerCase(letter-1)){
						letter -= 26;
					}
					if(letter > 'Z' && Character.isUpperCase(letter-1)){
						letter -= 26;
					}
					
				}
				
			}
			textEncrypted.append(letter);
		}
		
		return textEncrypted.toString();
	}

	@Override
	public String decrypt(String encryptText, String... key) {
		
		char[] arrayEncrypttext = encryptText.toCharArray();
		StringBuilder text = new StringBuilder(arrayEncrypttext.length);
		
		for(int i = 0; i < arrayEncrypttext.length;i++){
			char letter = Character.toChars(arrayEncrypttext[i])[0];
			if(letter != ' '){
				for(int j = 0;j<SHIFT;j++){
					letter--;
					if(letter < 'a' && Character.isLowerCase(letter+1)){
						letter +=26;
					}
					if(letter < 'A' && Character.isUpperCase(letter+1)){
						letter +=26;
					}

				}
			}
			text.append(letter);
		}
		return text.toString();
	}

	
}
