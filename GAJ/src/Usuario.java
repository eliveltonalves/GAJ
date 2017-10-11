
public class Usuario extends Pessoa{
	private String id;
	private String senha;
	
	
	//////ATRIBUTOS ADICIONADOS PARA TESTE///
	
	private String ins;
	private String seccional;
	private String tipoinscri;
	
	
	//////////////////////////////////////////
	
	
	
	public Usuario() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
	
	
	
	///////MÉTODOS CORRESPONDENTES AOS ATRIBUTOS PARA TESTE
	
	
	public String getInscricao() {
		return ins;
	}

	public void setInscricao(String inscricao) {
		this.ins = inscricao;
	}

	public String getSeccional() {
		return seccional;
	}

	public void setSeccional(String seccional) {
		this.seccional = seccional;
	}

	public String getTipoinscri() {
		return tipoinscri;
	}

	public void setTipoinscri(String tipoinscri) {
		this.tipoinscri = tipoinscri;
	}
	
	
	
	////////////////////////////////////////////////////////////
	
	
	
	

}
