package Services.ContaService;

import MinhasException.BancoException;
import Model.Conta;
import Model.ContaCorrente;



public  class ContaService {



    public static boolean depositar (ContaCorrente cc, Double valor){

        if( valor < 0.0) {
            System.out.println("!!!");
            throw new BancoException("Valor Invalido");
        }
        cc.setSaldo(cc.getSaldo()+valor);
        return true;
    }


    public static boolean sacar (ContaCorrente cc, Double valor){

        if( valor > cc.getSaldo()) {
            System.out.println("!!!");
            throw new BancoException("Valor Invalido");
        }
        cc.setSaldo(cc.getSaldo()-valor);
        return true;
    }

}
