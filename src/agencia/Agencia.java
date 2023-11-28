package agencia;

import java.util.List;
import java.util.Set;

import agencia.Pacote;

import java.util.LinkedList;

public class Agencia {
    
    // atributos da classe
    private int cnpj;
    private String nome;
    private int telefone;
    private String email;
    private List<Usuario> listaUsuario;
    private Set<Destino> listaDestinos;
    private List<Transporte> listaTransporte;
    private List<Acomodacao> listaAcomodacao;
    private List<Turismo> listaTurismo;

    // construtor da classe
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

    // Getters e Setters

    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
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
