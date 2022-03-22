public class Carro {
    private String modelo;
    private int ano;
    private String fabricante;

    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(String modelo, int ano, String fabricante){
        this.modelo = modelo;
        this.ano = ano;
        this.fabricante = fabricante;
    }

    public int getAno(){
        return this.ano;
    }

    public String getfabricante(){
        return this.fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public static void main(String[] args){
        Carro carro = new Carro("Fusca", 1987);

        System.out.println(carro.ano);
    }
}
