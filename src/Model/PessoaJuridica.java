package Model;

public class PessoaJuridica extends Pessoa{

    private String contato;
    private String CNPJ;


    public PessoaJuridica(String nome, String documento, String telefone, String email, String contato, String CNPJ) {
        super(nome, documento, telefone, email);
        this.contato = contato;
        this.CNPJ = CNPJ;
    }
}
