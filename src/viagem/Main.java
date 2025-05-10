package viagem;

import viagem.*;
import passageiro.*;

public class Main {
    public static void main(String[] args) {
        // Criando alguns passageiros
        Passageiro p1 = new PassageiroNormal();
        p1.setNome("João");
        ((PassageiroNormal) p1).setValorPassagem(50.0); // Definindo valor para normal

        Passageiro p2 = new PassageiroCrianca();
        p2.setNome("Maria");
        ((PassageiroCrianca) p2).setIdade(4); // Criança com 4 anos

        Passageiro p3 = new PassageiroIdoso();
        p3.setNome("Carlos");
        ((PassageiroIdoso) p3).setIdade(70); // Idoso com 70 anos

        // Criando alguns trechos
        Trecho trecho1 = new Trecho("São Paulo", "Rio de Janeiro", 450);
        Trecho trecho2 = new Trecho("Rio de Janeiro", "Belo Horizonte", 400);

        // Criando a rota e associando os trechos e passageiros
        Rota rota = new Rota();
        rota.adicionarTrecho(trecho1);
        rota.adicionarTrecho(trecho2);
        
        rota.adicionarPassageiroAoTrecho(p1, trecho1);
        rota.adicionarPassageiroAoTrecho(p2, trecho1);
        rota.adicionarPassageiroAoTrecho(p3, trecho2);

        // Exibindo o relatório de passageiros por trecho
        rota.exibirRelatorioPassageiros();
    }
}
