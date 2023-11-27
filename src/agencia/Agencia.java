package agencia;
import java.util.List;
import java.util.Set;

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
}