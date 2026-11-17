package JogoInvestigation;

public class Casos {
    private String local;
    private String data;
    private String hora;
    private String acontecimento;
    private String codigoCaso;

    public Casos(String local, String data, String hora, String acontecimento, String codigoCaso){
        this.local = local;
        this.data = data;
        this.hora = hora;
        this.acontecimento = acontecimento;
        this.codigoCaso = codigoCaso;
    }

    public String getLocal(){return this.local;}
    public String getData(){return this.data;}
    public String getHora(){return this.hora;}
    public String getAcontecimento(){return this.acontecimento;}
    public String getCodigoCaso(){return this.codigoCaso;}

    public void setLocal(String novoLocal){this.local = novoLocal;}
    public void setData(String novaData){this.data = novaData;}
    public void setHora(String novaHora){this.hora = novaHora;}
    public void setAcontecimento(String mudaAcontecimento){this.acontecimento = mudaAcontecimento;}
    public void setCodigoCaso(String mudaCodigoCaso){this.codigoCaso = mudaCodigoCaso;}

    public String toString(){
        return "O caso de número: " + this.codigoCaso + " do local: " + this.local + " da data: " + this.data +
                " da hora: " + this.hora + " com a descrição do acontecimento: " + this.acontecimento;
    }
}
