package agencia;

import java.util.Scanner;
import java.util.List;

public class Destino {
    private String name;
    private List<Float> distancia;
    private String descricao;
    private List<String> avaliacao;

 // Construtor
    public Destino(String name, List<Float> distancia, String descricao, List<String> avaliacao) {
        this.name = name;
        this.distancia = distancia;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
    }
    
 // Método para definir o serviço procurado (Transporte, Acomodação, Turismo)
    public String definirServicoProcurado(Pacote pacote, String tipoServico) {
        String servicoEscolhido = "";
                
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o serviço procurado: ");
        tipoServico = scanner.nextLine();
        
        switch (tipoServico.toLowerCase()) {
        	case "transporte":
                servicoEscolhido = "Serviço de transporte escolhido";
                break;
            case "acomodacao":
                servicoEscolhido = "Serviço de acomodacao escolhido";
                break;
            case "turismo":
                servicoEscolhido = "Serviço de turismo escolhido";
                break;
            default:
                System.out.println("Serviço não reconhecido.");
        }
        return servicoEscolhido;
    }
    
    
    public String selecionarServicos() {
    	
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
