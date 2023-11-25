import java.time.LocalDate;

public class Usuario {

	//atributos da classe
	private String login;
	private String senha;
	private String nome;
	private int cpf;
	private int telefone;
	private String email;
	private LocalDate nascimento;
					
	//construtor da classe
	public Usuario(String login, String senha, String nome, int cpf, int telefone, String email, LocalDate nascimento) {
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.nascimento = nascimento;
	}
	
	//Metodos da classe
		
	//Getters para acessar os atributos privado
	public String getLogin() {
		return login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	
	public String setLogin() {
		return login;
	}
	
	public String setSenha() {
		return senha;
	}
	
	public String setNome() {
		return nome;
	}
	
	public int setCpf() {
		return cpf;
	}
	
	public int setTelefone() {
		return telefone;
	}
	
	public String setEmail() {
		return email;
	}
	
	public LocalDate setNascimento() {
		return nascimento;
	}			
}