public enum TransporteTipo {
    Maritimo("Navio"),
    Aviao("Avião"),
    Onibus("Ônibus");

    private String descricao;

    TransporteTipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

public class Transporte {

    private TransporteTipo tipo;
    private String origem;
    private String destino;
    private float preco;

    public Transporte(String origem, String destino, float preco) {
        this.origem = origem;
        this.destino = destino;
        this.preco = preco;
    }

    public TransporteTipo getTipo() {
        return tipo;
    }

    public void setTipo(TransporteTipo tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}

