import java.util.List;
import java.util.ArrayList;

public class Banco{
  private int numero;
  private String nome;
  private ArrayList<Conta> contas = new ArrayList<Conta>();

  public void cadastrarConta (Conta conta){
    this.contas.add(conta);
  }
  public void removerConta(Conta conta){
    this.contas.remove(conta);
  }
  public void exibirContas(){
    for(Conta c : contas){ 
      System.out.println(c.toString());
    }
  }

  public Banco(int numero, String nome ,ArrayList<Conta> contas){
    this.numero = numero;
    this.nome = nome;
    this.contas = contas;
  }

  public int getNumero(){
    return this.numero;
  }
  public void setNumero(int numero){
    this.numero = numero;
  }

  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
}