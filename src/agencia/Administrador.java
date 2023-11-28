package agencia;

import java.time.LocalDate;

//HERANÇA (Usuario -> Administrador): Um administrador herda os métodos e atributos do Usuario e aplica seus respectivos próprios.

public class Administrador extends Usuario {

    // Atributos adicionais específicos da classe Administrador
    private String cargo;

    // Construtor da classe Administrador que chama o construtor da classe pai (Usuario)
    public Administrador(String login, String senha, String nome, String cpf, int telefone, String email, LocalDate nascimento, String cargo) {
        // Chamando o construtor da classe pai (Usuario)
        super(login, senha, nome, cpf, telefone, email, nascimento);

        // Inicializando o atributo específico da classe Administrador
        this.cargo = cargo;
    }

    // Outros métodos da classe Administrador...

    // Getters e setters específicos da classe Administrador...
    
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
    
}
