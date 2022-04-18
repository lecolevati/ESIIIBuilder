package model;

import java.util.ArrayList;
import java.util.List;

public class PessoaBuilder {

    private Pessoa pessoa;
    private EnderecoPessoa endereco;
    private List<TelefonePessoa> telefones = new ArrayList<TelefonePessoa>();
    
    public PessoaBuilder() {
        this.pessoa = new Pessoa();
        this.endereco = new EnderecoPessoa();
    }
    
    public static PessoaBuilder builder() {
        return new PessoaBuilder();
    }
    
    public PessoaBuilder addNome(String nome, String sobrenome) {
        this.pessoa.setNome(nome);
        this.pessoa.setSobrenome(sobrenome);
        return this;
    }  

    public PessoaBuilder addDtNascimento(int dia, int mes, int ano) {
        this.pessoa.setDia(dia);
        this.pessoa.setMes(mes);
        this.pessoa.setAno(ano);
        return this;
    }
    
    public PessoaBuilder addEndereco(String logradouro, int numero, String bairro, String cidade) {
    	this.endereco.setLogradouro(logradouro);
    	this.endereco.setNumero(numero);
    	this.endereco.setBairro(bairro);
    	this.endereco.setCidade(cidade);
    	return this;
    }
    
    public PessoaBuilder addComplemento(String complemento) {
        this.endereco.setComplemento(complemento);
        return this;
    }
    
    public PessoaBuilder addPais(String pais) {
        this.endereco.setPais(pais);
        return this;
    }
    
    public PessoaBuilder addFone(int ddd, int numero, TipoFone tipoFone) {
        TelefonePessoa tel = new TelefonePessoa();
        tel.setDdd(ddd);
        tel.setNumero(numero);
        tel.setTipo(tipoFone);
    	this.telefones.add(tel);
        return this;
    }
    
    public Pessoa get() {
        this.pessoa.setEndereco(this.endereco);
        this.pessoa.setTelefones(this.telefones);
        return this.pessoa;
    }
}
