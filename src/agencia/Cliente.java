package agencia;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

//ASSOCIAÇÃO (Cliente -> Pacote): - um Cliente pode ter varios pacotes, e um pacote especifico tem um unico cliente.

//HERANÇA (Usuario -> Cliente): Um Cliente herda os métodos e atributos do Usuario e aplica seus respectivos próprios.

public class Cliente extends Usuario {

    // Atributos adicionais específicos da classe Cliente
	private List<Float> endereco;
	private ArrayList<Pacote> pacotes;
    private String tipoCliente;
    
    // Construtor da classe Cliente que chama o construtor da classe pai (Usuario)
    public Cliente(String login, String senha, String nome, String cpf, int telefone, String email, LocalDate nascimento, List<Float> endereco, ArrayList<Pacote> pacotes, String tipoCliente) {
        // Chamando o construtor da classe pai (Usuario)
        super(login, senha, nome, cpf, telefone, email, nascimento);

        // Inicializando os atributos específicos da classe Cliente
        this.endereco = endereco;
        this.pacotes = new ArrayList<>();
        this.tipoCliente = tipoCliente;
    }
	public Cliente(){
		
	}


    // Outros métodos da classe Cliente...

    // Getters e setters específicos da classe Cliente...
    
    public List<Float> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Float> endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Pacote> getPacotes() {
		return pacotes;
	}

	public void setPacotes(ArrayList<Pacote> pacotes) {
		this.pacotes = pacotes;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
    
}
