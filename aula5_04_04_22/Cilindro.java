public class Cilindro {
    private double raio;
    private double altura;
    public Cilindro(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    public double calculaVolume(){
        return (Math.PI * (this.raio * this.raio) * altura); 
    }
}
