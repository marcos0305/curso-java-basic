package com.loiane.cursojava.aula36;

public class Teste {

	public static void main(String [] args) {
	
		Contato contato = new Contato();
		contato.setNome("Marcos Paulo");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("11 99999-9999");
		
		
		//RELACIONAMENTO TEM UM ENDEREÇO
		
		Endereco end = new Endereco();
		end.setNomeRua("Rua do milagre");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Gama");
		end.setEstato("Brasilia");
		end.setCep("0000000");
		
		contato.setEndereco(end);

		//RELACIONAMENTO TEM UM TELEFONE
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDDD("61");
		telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDDD("61");
		telefone2.setNumero("88888-9999");
		
		Telefone[] telefones = new Telefone[2];
		telefones [0] = telefone;
		telefones [1] = telefone2;
		
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		//TESTE SAIDA NO CONSOLE
		System.out.println(contato.getNome());
		
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if (contato != null && contato.getTelefone() != null){
			System.out.println(contato.getTelefone().getDDD() + " " + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDDD() + " " + t.getNumero());
			}
		}
	}
	
}
