
public class PessoaFisica extends Pessoa {
	private int CPF;
	private int RG;
	private String orgaoEmissor;
	private int dataDeEmissao;
	private String nacionalidade;
	private String profissao;
	private String estadoCivil;
	
	public PessoaFisica() {
		
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public int getRG() {
		return RG;
	}

	public void setRG(int rG) {
		RG = rG;
	}

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public int getDataDeEmissao() {
		return dataDeEmissao;
	}

	public void setDataDeEmissao(int dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
}
