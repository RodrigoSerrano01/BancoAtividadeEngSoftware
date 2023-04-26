package Model;

import java.time.LocalDate;
import java.util.Date;

public abstract class Conta {

    private Double saldo;
    private Integer agencia;
    private Integer digito;
    private LocalDate  dataAbertura;
    private String senha;

    private Pessoa pessoa;

    public Conta(Double saldo, Integer agencia, Integer digito, LocalDate dataAbertura, String senha, Pessoa pessoa) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.digito = digito;
        this.dataAbertura = dataAbertura;
        this.senha = senha;
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getDigito() {
        return digito;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public String getSenha() {
        return senha;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @Override
    public String toString() {
        return "Nome: "+ this.pessoa.getNome() + " Agencia: "+ this.getAgencia()+ "-"+ this.getDigito() + " saldo: "+ this.getSaldo();
    }
}
