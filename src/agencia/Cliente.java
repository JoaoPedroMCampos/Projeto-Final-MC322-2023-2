package agencia;

import java.time.LocalDate;

public class Cliente extends Usuario {

    // Atributos adicionais específicos da classe Cliente
    private String endereco;
    private String tipoCliente;

    // Construtor da classe Cliente que chama o construtor da classe pai (Usuario)
    public Cliente(String login, String senha, String nome, int cpf, int telefone, String email, LocalDate nascimento, String endereco, String tipoCliente) {
        // Chamando o construtor da classe pai (Usuario)
        super(login, senha, nome, cpf, telefone, email, nascimento);

        // Inicializando os atributos específicos da classe Cliente
        this.endereco = endereco;
        this.tipoCliente = tipoCliente;
    }

    // Outros métodos da classe Cliente...

    // Getters e setters específicos da classe Cliente...
}
