package agencia;

import java.util.LinkedList;
import java.time.LocalDate;

//Atributos da classe
//Criar getters e setters para os atributos a fim de usar em Agencia !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
public class Pacote {
    private LinkedList<Destino> destinos;
    private LinkedList<Transporte> transportes;
    private LinkedList<Acomodacao> acomodacoes;
    private int nVagasTransportes;
    private int nVagasAcomodacoes;
    private LinkedList<Turismo> turismos;
    private Usuario user;
    private int nPassageiros;
    private float preco;
    private LocalDate dataFim;
    private LocalDate dataInicio;
    private Categoria categoria;

    //construtores
    public Pacote(){
        //cria pacote vazio
    }

    public Pacote(LinkedList<Destino> destinos, LinkedList<Transporte> transportes, LinkedList<Acomodacao> acomodacoes,
            LinkedList<Turismo> turismos, Usuario user, int nPassageiros, float preco, LocalDate dataFim,
            LocalDate dataInicio, Categoria categoria, int nVagasTransportes,
           int nVagasAcomodacoes, int nVagasTurismos) {
        this.destinos = (destinos != null) ? destinos : new LinkedList<Destino>();
        this.transportes = (transportes != null) ? transportes : new LinkedList<Transporte>();
        this.acomodacoes = (acomodacoes != null) ? acomodacoes : new LinkedList<Acomodacao>();
        this.turismos = (turismos != null) ? turismos : new LinkedList<Turismo>();
        this.user = user;
        this.nPassageiros = nPassageiros;
        this.preco = preco;
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
        this.categoria = categoria;
        this.nVagasTransportes = nVagasTransportes;
        this.nVagasAcomodacoes = nVagasAcomodacoes;
    }

}

