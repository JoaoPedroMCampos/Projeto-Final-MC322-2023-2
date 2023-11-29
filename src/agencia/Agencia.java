package agencia;

import java.util.List;
import java.util.Set;
import java.util.Scanner;

import agencia.Pacote;

import java.time.LocalDate;
import java.util.LinkedList;

public class Agencia {
    
    // atributos da classe
    private String cnpj;
    private String nome;
    private int telefone;
    private String email;
    private List<Usuario> listaUsuario;
    private Set<Destino> listaDestinos;

    private Usuario currentUser;

    // construtor da classe
    public Agencia(String cnpj, String nome, int telefone, String email, List<Usuario> listaUsuario, 
            Set<Destino> listaDestinos) {

        this.cnpj = cnpj;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.listaUsuario = listaUsuario;
        this.listaDestinos = listaDestinos;
        currentUser = null;
    }

    public boolean adicionarUsuario(Usuario user){
        for(Usuario u : listaUsuario){
            if(u.getLogin().equals(user.getLogin()) && u.getSenha().equals(user.getSenha())){
                //login e senha ja existe
                System.out.println("Login ou senha ja se encontra cadastrado no sistema.");
                return false;
            }
        }
        this.listaUsuario.add(user);
        return true;
    }

    public void definirData(Pacote pacote, LocalDate dataInicio, LocalDate dataFim) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Coloque a data de início (dd/MM/yyyy) para esse pacote. ");
        String resposta_inicio_str = scanner.next();
        LocalDate resposta_inicio = LocalDate.parse(resposta_inicio_str, formatter);
        pacote.setDataInicio(resposta_inicio);

        System.out.print("Coloque a data de fim (dd/MM/yyyy) para esse pacote. ");
        String resposta_fim_str = scanner.next();
        LocalDate resposta_fim = LocalDate.parse(resposta_fim_str, formatter);
        pacote.setDataFim(resposta_fim);
    }

    // Método para definir a quantidade de pessoas na viagem
    public void definirQuantidadePessoas(Pacote pacote, int quantidadePessoas) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque a quantidade de pessoas para esse pacote. ");
        int resposta = scanner.nextInt();
        pacote.setnPassageiros(resposta);
    }

    // Método para verificar se deseja adicionar outro serviço ou encerrar o pacote
    public boolean desejaAdicionarOutroServico() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deseja adicionar outro serviço (s/n)? ");
        String resposta = scanner.next().toLowerCase();
        return resposta.equals("s");
    }
    
    public Pacote montarPacote() {
    	//Qual o seu destino?
    	//1 - X, 2 - Y
    	Map<String, Object> Servico = this.listaDestinos(2).selecionarServicos
    	//Quantos quartos
    	int quartos = 343
    	
    			public void adicionarDestino(Pacote pacote, Destino destino) {
            pacote.getDestinos().add(destino);
        }
    	
    	
    	Pacote novoPacote = new Pacote(adf, 343)
    	
    	return novoPacote
    	
    }

    public boolean logIn(String login, String senha){
		if(currentUser != null){
			System.out.println("Por favor, faça log out antes.");
			
			//lançamento de exceção talvez?
			
			return false;
		}else{
            if(listaUsuario == null){
                System.out.println("Agencia nao possui usuarios cadastrados no sistema.");
                return false;
            }
			for(Usuario u : listaUsuario){
				if(u.getLogin().equals(login) && u.getSenha().equals(senha)){
					//login com sucesso
					int index = listaUsuario.indexOf(u);
					currentUser = listaUsuario.get(index);
					return true;
				}
			}
			System.out.println("Login ou senha inválidos.");
			return false;
		}
	}

    // Getters e Setters

    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public Set<Destino> getListaDestinos() {
        return listaDestinos;
    }

    public void setListaDestinos(Set<Destino> listaDestinos) {
        this.listaDestinos = listaDestinos;
    }

    public Usuario getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Usuario currentUser) {
        this.currentUser = currentUser;
    }
    // Métodos de reserva com tratamento de excecao

    public void fazerReservaTransporte(int nPassageiros, int nVagasTransportes) {
        try {
            if (nVagasTransportes == nPassageiros) {
                throw new IllegalArgumentException();
            }
            nPassageiros = nPassageiros + 1;
            System.out.println("Reserva de transporte feita com sucesso");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao reservar transporte, vagas lotadas");
        }
    }

    public void fazerReservaAcomodacao(int nVagasAcomodacoes, int lotacao) {
        try {
            if (lotacao <= nVagasAcomodacoes) {
                throw new IllegalArgumentException();
            }
            nVagasAcomodacoes = nVagasAcomodacoes -1;
            System.out.println("Reserva de acomodação feita com sucesso");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao reservar acomodação, vagas lotadas");
        }
    }

    public void fazerReservaTurismos(int nVagasTurismos, int vagasDiarias) {
        try {
            if (vagasDiarias <= nVagasTurismos) {
                throw new IllegalArgumentException();
            }
            nVagasTurismos = nVagasTurismos - 1;
            System.out.println("Reserva de turismo feita com sucesso");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao reservar turismo, vagas lotadas");
        }
    }

    
}
