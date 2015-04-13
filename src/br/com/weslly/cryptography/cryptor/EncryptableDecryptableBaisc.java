package br.com.weslly.cryptography.cryptor;

public interface EncryptableDecryptableBaisc {

	public String encrypt(String text,String ... key);
	
	public String decrypt(String encryptText,String... key);
	
	
}

