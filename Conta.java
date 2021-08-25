public abstract class Conta implements IOperacoes {
  private int id;
  private String numero;
  private float saldo;
  
  @Override
  public float consultaSaldo(){
    return this.saldo;
  }
  @Override
  public void realizaSaque(float valor){
    if(valor>this.saldo){
      System.out.println("Saldo insuficinte!");
    }else{
      this.saldo -=valor;
      System.out.println("Saque de " + valor + " realizado");
    }
  }
  @Override
  public void realizaDeposito(float valor){
    if(valor<=0){
      System.out.println("Valor invalido!");
    }else{
      this.saldo += valor;
      System.out.println("Deposito de " + valor + " realizado");
    }
  }

  public String toString(){
    return "ID: "+ this.id + "; Numero: "+ this.numero + "; Saldo: " + this.saldo ;
  }

  public int getId(){
    return this.id;
  }
  public void setId(int id){
    this.id = id;
  }

  public String getNumero(){
    return this.numero;
  }
  public void setNumero(String numero){
    this.numero = numero;
  }

  public float getSaldo(){
    return this.saldo;
  }
  public void setSaldo(float saldo){
    this.saldo = saldo;
  }
} 