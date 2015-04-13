package br.com.weslly.cryptography.cryptor.Teste;

import br.com.weslly.cryptography.cryptor.CesarCipher;

public class CesarCipherTest {

	public static void main(String[] args) {
		CesarCipher cesar = new CesarCipher();
	System.out.println(cesar.encrypt("Antonia zildete de Oliveira"));
		System.out.println(cesar.decrypt("Dqwrqld Cloghwh gh Rolyhlud"));
	}
}
