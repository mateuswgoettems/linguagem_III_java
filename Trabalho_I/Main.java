import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        // Cliente
        Date nascimentoCliente = new Date(1995-1900, 10, 10);
        String nameCliente = "João da Silva Ferreira";
        int codigoCliente = getRandom(1, 125486) * 1000;

        Cliente cliente = new Cliente(nascimentoCliente, nameCliente, codigoCliente);

        // Funcionário
        Date nascimentoFuncionario = new Date(1995-1900, 10, 10);
        String nameFuncionatio = "Maria da Silva";
        double salarioFuncionario = 3000;

        Funcionario funcionario = new Funcionario(nascimentoFuncionario, nameFuncionatio, salarioFuncionario);

        // Gerente
        Date nascimentoGerente = new Date(1995-1900, 10, 10);
        String area = "Vendas";
        String nameGerente = "João da Silva";
        double salarioGerente = 3000;

        Gerente gerente = new Gerente(area, nascimentoGerente, nameGerente, salarioGerente);

        cliente.imprimeDados();
        gerente.imprimeDados();
        funcionario.imprimeDados();
    }

    public static int getRandom(int min, int max){
        Random random = new Random();

        return (int)(min + (max - min) * random.nextDouble());
    }

}
