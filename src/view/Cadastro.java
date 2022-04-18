package view;

import java.util.ArrayList;
import java.util.List;

import model.EnderecoPessoa;
import model.Pessoa;
import model.TelefonePessoa;
import model.TipoFone;

public class Cadastro {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Alice");
		pessoa.setSobrenome("dos Santos");
		pessoa.setDia(22);
		pessoa.setMes(5);
		pessoa.setAno(1980);

		EnderecoPessoa endereco = new EnderecoPessoa();
		endereco.setLogradouro("Rua das Oliveiras");
		endereco.setNumero(272);
		endereco.setComplemento("Bloco B");
		endereco.setCidade("São Paulo");
		endereco.setBairro("Centro");
		endereco.setPais("Brasil");

		pessoa.setEndereco(endereco);

		List<TelefonePessoa> telefones = new ArrayList<TelefonePessoa>();

		TelefonePessoa residencial = new TelefonePessoa();
		residencial.setDdd(11);
		residencial.setNumero(22221111);
		residencial.setTipo(TipoFone.RESIDENCIAL);
		
		TelefonePessoa celular = new TelefonePessoa();
		celular.setDdd(11);
		celular.setNumero(22221111);
		celular.setTipo(TipoFone.RESIDENCIAL);


		telefones.add(residencial);
		telefones.add(celular);

		pessoa.setTelefones(telefones);

		System.out.println(pessoa.toString());
	}
}
