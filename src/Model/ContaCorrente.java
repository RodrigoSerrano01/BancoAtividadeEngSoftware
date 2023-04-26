package Model;

import Services.ContaService.ContaService;

import java.time.LocalDate;
import java.util.Date;

public class ContaCorrente extends Conta{


    public ContaCorrente(Double saldo, Integer agencia, Integer digito, LocalDate dataAbertura, String senha, Pessoa pessoa) {
        super(saldo, agencia, digito, dataAbertura, senha, pessoa);
    }

    public void depositar(ContaCorrente cc, Double valor){

        ContaService.depositar(cc, valor);

    }

    public void sacar(ContaCorrente cc, Double valor){

        ContaService.sacar(cc, valor);

    }

    public void transferir(ContaCorrente cc1,ContaCorrente cc2, Double valor){

        ContaService.sacar(cc1,valor);
        ContaService.depositar(cc2,valor);

    }


    @Override
    public String toString() {
        return super.toString();
    }
}
