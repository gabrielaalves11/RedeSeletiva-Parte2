package model;

public class User {
	
	int id;
	String email;
	String senha;
	String confirSenha;
    String nome;
    String sobrenome;
    String data;
    String sexo;
    String celular;
    String telefone;
    String cnpj;
    String rua;
    String cep;
    String numero;
    String complemento;
    String referencia;
    String bairro;
    String cidade;
    String estado;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", senha=" + senha + ", confirSenha=" + confirSenha + ", nome="
				+ nome + ", sobrenome=" + sobrenome + ", data=" + data + ", sexo=" + sexo + ", celular=" + celular
				+ ", telefone=" + telefone + ", cnpj=" + cnpj + ", rua=" + rua + ", cep=" + cep + ", numero=" + numero
				+ ", complemento=" + complemento + ", referencia=" + referencia + ", bairro=" + bairro + ", cidade="
				+ cidade + ", estado=" + estado + "]";
	}
	
	public User(int id, String email, String senha, String confirSenha, String nome, String sobrenome, String data,
			String sexo, String celular, String telefone, String cnpj, String rua, String cep, String numero,
			String complemento, String referencia, String bairro, String cidade, String estado) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.confirSenha = confirSenha;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.data = data;
		this.sexo = sexo;
		this.celular = celular;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.referencia = referencia;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirSenha() {
		return confirSenha;
	}

	public void setConfirSenha(String confirSenha) {
		this.confirSenha = confirSenha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
