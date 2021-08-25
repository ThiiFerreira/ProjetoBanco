import java.util.List;
import java.util.ArrayList;

class main {
  public static void main(String[] args) {
    ArrayList<Conta> contas = new ArrayList<Conta>();
    
    Banco B1 = new Banco (1,"Santdie" ,contas);
    Corrente cc1 = new Corrente();
    Corrente cc2 = new Corrente();
    Poupanca cp1 = new Poupanca();
    Poupanca cp2 = new Poupanca();

    cc1.setId(1);
    cc1.setNumero("0001");
    cc1.setLimite(500f);
    cc1.realizaDeposito(1000f);

    cc2.setId(2);
    cc2.setNumero("0004");
    cc2.setLimite(1000f);
    cc2.realizaDeposito(2000f);

    cp1.setId(3);
    cp1.setNumero("0003");
    cp1.setTaxaJuro(4f);
    cp1.realizaDeposito(3000f);

    cp2.setId(4);
    cp2.setNumero("0001");
    cp2.setTaxaJuro(10f);
    cp2.realizaDeposito(4000f);

    B1.cadastrarConta(cc1);
    B1.cadastrarConta(cc2);
    B1.cadastrarConta(cp1);
    B1.cadastrarConta(cp2);
    B1.exibirContas();
  }
}