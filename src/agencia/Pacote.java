package agencia;

import java.util.LinkedList;
import java.time.LocalDate;

public class Pacote {
    private LinkedList<Destino> destinos;
    private LinkedList<Transporte> transportes;
    private LinkedList<Acomodacao> acomodacoes;
    private LinkedList<Turismo> turismos;
    private Usuario user;
    private int nPassageiros;
    private float preco;
    private LocalDate dataFim;
    private LocalDate dataInicio;
    private Categoria categoria;

    public Pacote(LinkedList<Destino> destinos, LinkedList<Transporte> transportes, LinkedList<Acomodacao> acomodacoes,
            LinkedList<Turismo> turismos, Usuario user, int nPassageiros, float preco, LocalDate dataFim,
            LocalDate dataInicio, Categoria categoria) {
        this.destinos = destinos;
        this.transportes = transportes;
        this.acomodacoes = acomodacoes;
        this.turismos = turismos;
        this.user = user;
        this.nPassageiros = nPassageiros;
        this.preco = preco;
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
        this.categoria = categoria;
    }

    public enum Categoria{
        //falta adicionar categorias
    }
    //getters
    public LinkedList<Destino> getDestinos() {
        return destinos;
    }

    public LinkedList<Transporte> getTransportes() {
        return transportes;
    }

    public LinkedList<Acomodacao> getAcomodacoes() {
        return acomodacoes;
    }

    public LinkedList<Turismo> getTurismos() {
        return turismos;
    }

    public Usuario getUser() {
        return user;
    }

    public int getnPassageiros() {
        return nPassageiros;
    }

    public float getPreco() {
        return preco;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    //setters
    public void setDestinos(LinkedList<Destino> destinos) {
        this.destinos = destinos;
    }

    public void setTransportes(LinkedList<Transporte> transportes) {
        this.transportes = transportes;
    }

    public void setAcomodacoes(LinkedList<Acomodacao> acomodacoes) {
        this.acomodacoes = acomodacoes;
    }

    public void setTurismos(LinkedList<Turismo> turismos) {
        this.turismos = turismos;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void setnPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    

}
