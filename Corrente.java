public class Corrente extends Conta{
  private float limite;

  @Override
  public float consultaSaldo(){
    return super.consultaSaldo() + limite;
  }
  @Override
  public void realizaSaque(float valor){
    if(this.getSaldo() >= valor ){
      this.setSaldo((this.getSaldo()-valor));
      System.out.println("Saque de " + valor + " realizado");
    }else if(this.getSaldo() < valor){
      if((this.getSaldo()+this.limite)< valor){
        System.out.println("Saldo+limite insuficinte para saque");
      }else{
        float aux = valor;
        aux = valor - this.getSaldo();
        this.setSaldo(0f);
        this.limite = this.limite - aux;
        System.out.println("Saque de " + valor + " realizado!");
      }
    }
  }
  /*@Override
  public void realizaDeposito(float valor){
  }*/

  @Override
  public String toString(){
    return super.toString() + "; Limite: " + limite;
  }
  

  public float getLimite(){
    return this.limite;
  }
  public void setLimite(float limite){
    this.limite = limite;
  }
}