package agencia;

import java.util.List;

public class Destino {
    private String name;
    private List<Float> distancia;
    private String descricao;
    private List<String> avaliacao;

    private List<Transporte> listaTransporte;
    private List<Acomodacao> listaAcomodacao;
    private List<Turismo> listaTurismo;
    


 // Construtor
    public Destino(String name, List<Float> distancia, String descricao, List<String> avaliacao) {
        this.name = name;
        this.distancia = distancia;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<Float> getDistancia() {
        return distancia;
    }

   
    public void setDistacia(float latitude, float longitude) {
        this.distancia.add(latitude);
        this.distancia.add(longitude);
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public List<String> getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao.add(avaliacao);
    }
}
