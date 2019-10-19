package br.com.engenhariasoftware.model.teste;

import java.util.Scanner;

import br.com.engenhariasoftware.model.Bairro;
import br.com.engenhariasoftware.model.Logradouro;

public class Launch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Logradouro logradouro1 = new Logradouro("Duque de Caxias");
		logradouro1.setNome("Duque de Caxias");
		logradouro1.setTipo("Avenida");
		logradouro1.setNumero("2345");
		logradouro1.setCep("55222-000");
		
		Bairro bairro1 = new Bairro("Centro");

	}

}
