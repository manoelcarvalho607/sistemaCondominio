package sistemaCond01;

public class Morador {
	
	private int codigo;
	
	private String nome;
	
	private String cpf;
	
	private String rg;
	
	private String endereco;
	
	private String placaAuto;
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * importante: Não pegaremos o numero do cpf dos moradores.
	 * 
	 * @return
	 * @deprecated
	 * 
	 * importante: Registrar somente o numero da placa ou nome do morador.
	 * 
	 * @see String setNome();
	 * @see String setPlacaAuto();
	 * 
	 */

	public String getCpf() {
		return cpf;
	}
	
	/**
	 * importante: não pegaremos o numero do cpf dos moradores.
	 * 
	 * @return
	 * @deprecated
	 * 
	 * importante: registrar somente o numero da placa ou nome do morador.
	 * 
	 * @see String setNome();
	 * @see String setPalcaAuto();
	 * 
	 */

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * importante: não pegaremos o numero do RG dos moradores.
	 * 
	 * @return
	 * @deprecated
	 * 
	 * importante: registrar somente o numero da placa ou nome do morador.
	 * 
	 * @see String setNome();
	 * @see String setPalcaAuto();
	 * 
	 */
	public String getRg() {
		return rg;
	}
	
	/**
	 * importante: não pegaremos o numero do cpf dos moradores.
	 * 
	 * @return
	 * @deprecated
	 * 
	 * importante: registrar somente o numero da placa ou nome do morador.
	 * 
	 * @see String setNome();
	 * @see String setPalcaAuto();
	 * 
	 */

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getPlacaAuto() {
		return placaAuto;
	}

	public void setPlacaAuto(String placaAuto) {
		this.placaAuto = placaAuto;
	}
	
	

}
