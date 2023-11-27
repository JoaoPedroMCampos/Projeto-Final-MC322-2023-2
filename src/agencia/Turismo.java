package agencia;
import java.time.LocalDate;

public class Turismo {
    //atributos e respectivos setters
    private String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }

    private int duracao;
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    private String localEncontro;
    public void setLocalEncontro(String localEncontro) {
        this.localEncontro = localEncontro;
    }

    private LocalDate horaInicio;
    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    private int vagasDiarias;
    public void setVagasDiarias(int vagasDiarias) {
        this.vagasDiarias = vagasDiarias;
    }

    private LocalDate data;
    public void setData(LocalDate data) {
        this.data = data;
    }

    private LocalDate indisponibilidade;
    public void setIndisponibilidade(LocalDate indisponibilidade) {
        this.indisponibilidade = indisponibilidade;
    }

    private float preco;
    public void setPreco(float preco) {
        this.preco = preco;
    }

    //constructor
    public Turismo (String nome, int duracao, String localEncontro, LocalDate horaInicio, int vagasDiarias, LocalDate data, LocalDate indisponiblidade, float preco) {
        this.nome = nome;
        this.duracao = duracao;
        this.localEncontro = localEncontro;
        this.horaInicio = horaInicio;
        this.vagasDiarias = vagasDiarias;
        this.data = data;
        this.indisponibilidade = indisponiblidade;
        this.preco = preco;
    }

    //getters
    public String getNome () {
        return nome;
    }

    public String getLocalEncontro () {
        return localEncontro;
    }

    public int getDuracao () {
        return duracao;
    }

    public int getVagasDiarias () {
        return vagasDiarias;
    }

    public LocalDate getHoraInicio () {
        return horaInicio;
    }

    public LocalDate getData () {
        return data;
    }

    public LocalDate getIndisponibilidade() {
        return indisponibilidade;
    }

    public float getPreco () {
        return preco;
    }
}


