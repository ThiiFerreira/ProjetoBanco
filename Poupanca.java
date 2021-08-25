public class Poupanca extends Conta {
  private float taxaJuro;

  /*@Override
  public float consultaSaldo(){
  }
  @Override
  public void realizaSaque(float valor){
  }
  @Override
  public void realizaDeposito(float valor){
  }*/

  public float getTaxaJuro(){
    return this.taxaJuro;
  }
  public void setTaxaJuro(float taxaJuro){
    this.taxaJuro = taxaJuro/100;
  }

   @Override
  public String toString(){
    return super.toString() + "; Taxa de juro: " + taxaJuro;
  }
}