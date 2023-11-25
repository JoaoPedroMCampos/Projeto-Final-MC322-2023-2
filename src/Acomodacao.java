public class Acomodacao {
    //atributos
    private String local;
    private int lotacao;
    private float preco;

    //constructor
    public Acomodacao (String local, int lotacao, float preco) {
        this.local = local;
        this.lotacao = lotacao;
        this.preco = preco;
    }

    //getters
    public String getLocal () {
        return local;
    }

    public int getLotacao () {
        return lotacao;
    }

    public float getPreco () {
        return preco;
    }

    //setters
    public void setLocal (String local) {
        this.local = local;
    }

    public void setLotacao (int lotacao) {
        this.lotacao = lotacao;
    }

    public void setPreco (flaot preco) {
        this.preco = preco;
    }
}
