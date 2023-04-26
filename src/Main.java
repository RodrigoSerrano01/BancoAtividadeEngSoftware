import Model.ContaCorrente;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import Services.ContaService.ContaService;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        PessoaFisica p1 = new PessoaFisica("Rodrigo","12345","12345","rodrigo@gmail.com");
        PessoaFisica p2 = new PessoaFisica("JAO","54321","54321","JAO@gmail.com");

        PessoaJuridica pj1 = new PessoaJuridica("Bar do tio", "987654","42345","tio@gmail.com", "tio.com.br","913112");

        ContaCorrente cc1 = new ContaCorrente(500.0, 123, 2, LocalDate.now(), "123", p1);

        ContaCorrente cc2 = new ContaCorrente(100.0, 123, 3, LocalDate.now(), "123", p2);

        ContaCorrente cc3 = new ContaCorrente(0.0, 123, 7, LocalDate.now(), "123", pj1);


        System.out.println("Criado: "+cc1);
        System.out.println("Criado: "+cc2);




        cc1.depositar(cc1, 100.0);
        System.out.println("Deposito de 100: "+ cc1);

        cc1.sacar(cc1, 100.0);
        System.out.println("Saque de 100: " + cc1);

        cc2.transferir(cc1,cc2, 500.0);

        System.out.println("Tranferencia de 500: " + cc1);
        System.out.println("Recebeu : " + cc2);


        cc3.depositar(cc3, 1000.0);

        System.out.println("Deposito em PJ de 1000: "+cc3);
    }
}