package agencia;
import java.util.List;
import java.util.Set;
import agencia.Pacote;

public class Agencia {
	
	//atributos da classe
	private int cnpj;
    private String nome;
    private int telefone;
    private String email;
    private List<Usuario> listaUsuario;
    private Set<Destino> listaDestinos;
    private List<Transporte> listaTransporte;
    private List<Acomodacao> listaAcomodacao;
    private List<Turismo> listaTurismo;
						
	//construtor da classe
	public Agencia(int cnpj, String nome, int telefone, String email, List<Usuario> listaUsuario, 
			Set<Destino> listaDestinos, List<Transporte> listaTransporte, 
			List<Acomodacao> listaAcomodacao, List<Turismo> listaTurismo) {

		this.cnpj = cnpj;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.listaUsuario = listaUsuario;
		this.listaDestinos = listaDestinos;
		this.listaTransporte = listaTransporte;
		this.listaTurismo = listaTurismo;
		this.listaAcomodacao = listaAcomodacao;
	}
	
	//Metodos da classe
		
	//Getters para acessar os atributos privado
	public int getCnpj() {
		return cnpj;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}
	
	public Set<Destino> getListaDestinos() {
		return listaDestinos;
	}
	
	public List<Transporte> getListaTransporte() {
		return listaTransporte;
	}
	
	public List<Acomodacao> getListaAcomodacao() {
		return listaAcomodacao;
	}
	
	public List<Turismo> getListaTurismo() {
		return listaTurismo;
	}
	
	public int setCnpj() {
        return cnpj;
    }

    public String setNome() {
        return nome;
    }

    public int setTelefone() {
        return telefone;
    }

    public String setEmail() {
        return email;
    }

    public List<Usuario> setListaUsuario() {
        return listaUsuario;
    }

    public Set<Destino> setListaDestinos() {
        return listaDestinos;
    }

    public List<Transporte> setListaTransporte() {
        return listaTransporte;
    }

    public List<Acomodacao> setListaAcomodacao() {
        return listaAcomodacao;
    }

    public List<Turismo> setListaTurismo() {
        return listaTurismo;
    }

	//Tratamento de excecoes Reserva Transporte
	public void fazerReservaTransporte (int nPassageiros, int nVagasTransportes) {
		try {
			if (nVagasTransportes == nPassageiros) {
				throw new IllegalArgumentException ();
			}
			nPassageiros = nPassageiros + 1;
			System.out.println("Reserva de transporte feita com sucesso");
		}
		catch (IllegalArgumentException e) {
			System.err.println("Erro ao reservar transporte, vagas lotadas");
		}
	}

	//Tratamento de excecoes Reserva Acomodacao
	public void fazerReservaAcomodacao (LinkedList Acomodacao, LinkedList VagasAcomodacoes) {
		try {
			for (int i = 0; i < Acomodacao.size(); i++) {
				if (VagasAcomodacoes.get(i) == Acomodacao.get(i)) {
					throw new IllegalArgumentException ();
				}
			}
			VagasAcomodacoes = VagasAcomodacoes + 1;
			System.out.println("Reserva de acomodação feita com sucesso");
		}
		catch (IllegalArgumentException e) {
			System.err.println("Erro ao reservar acomodação, vagas lotadas");
		}
	}

	//Tratamento de excecoes Reserva Turismo
	public void fazerReservaTurismos (LinkedList Turismo, LinkedList VagasTurismo) {
		try {
			for (int i = 0; i < Turismo.size(); i++) {
				if (VagasTurismo.get(i) == Turismo.get(i)) {
					throw new IllegalArgumentException ();
				}
			}
			VagasTurismo = VagasTurismo + 1;
			System.out.println("Reserva de turismo feita com sucesso");
		}
		catch (IllegalArgumentException e) {
			System.err.println("Erro ao reservar turismo, vagas lotadas");
		}
	}
}	