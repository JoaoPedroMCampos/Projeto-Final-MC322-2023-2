package agencia;

import java.util.LinkedList;
import java.time.LocalDate;

//Atributos da classe
public class Pacote {
    private LinkedList<Destino> destinos;
    private LinkedList<Transporte> transportes;
    private int nVagasTransportes;
    private LinkedList<Acomodacao> acomodacoes;
    private int nVagasAcomodacoes;
    private LinkedList<Turismo> turismos;
    private Usuario user;
    private int nPassageiros;
    private float preco;
    private LocalDate dataFim;
    private LocalDate dataInicio;
    private Categoria categoria;

    public enum Categoria {
        AVENTURA, ESPORTE, GASTRONOMIA, ARTE, ENTRETENIMENTO;
    }

    //construtores
    public Pacote(LinkedList<Destino> destinos, LinkedList<Transporte> transportes, LinkedList<Acomodacao> acomodacoes,
            LinkedList<Turismo> turismos, Usuario user, int nPassageiros, float preco, LocalDate dataFim,
            LocalDate dataInicio, Categoria categoria, int nVagasTransportes,
           int nVagasAcomodacoes, int nVagasTurismos) {
        this.destinos = (destinos != null) ? destinos : new LinkedList<>();
        this.transportes = (transportes != null) ? transportes : new LinkedList<>();
        this.acomodacoes = (acomodacoes != null) ? acomodacoes : new LinkedList<>();
        this.turismos = (turismos != null) ? turismos : new LinkedList<>();
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
