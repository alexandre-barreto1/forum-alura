package br.com.alura.forum.dto;

public class TokenDTO {
	
	private String token;
	private String barer;

	public TokenDTO (String token, String barer) {
		this.token = token;
		this.barer = barer;
	}

	public String getToken() {
		return token;
	}

	public String getBarer() {
		return barer;
	}
}
