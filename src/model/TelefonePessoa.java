package model;

public class TelefonePessoa {
	private int ddd;
	private int numero;
	private TipoFone tipo;
	
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public TipoFone getTipo() {
		return tipo;
	}
	public void setTipo(TipoFone tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "EnderecoPessoa [ddd=" + ddd + ", numero=" + numero + ", tipo=" + tipo + "]";
	}
	
}
