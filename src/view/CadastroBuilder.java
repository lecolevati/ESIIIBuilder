package view;

import model.Pessoa;
import model.PessoaBuilder;
import model.TipoFone;

public class CadastroBuilder {

	public static void main(String[] args) {
        Pessoa pessoa = PessoaBuilder.builder()
                .addNome("Alice", "dos Santos")
                .addDtNascimento(22, 5, 1980)
                .addEndereco("Rua das Oliveiras", 272, "Centro", "São Paulo")
                .addComplemento("Bloco B")
                .addPais("Brasil")
                .addFone(11, 22221234, TipoFone.RESIDENCIAL)
                .addFone(11, 999991234, TipoFone.CELULAR)
                .get();

        System.out.println(pessoa.toString());
	}

}
