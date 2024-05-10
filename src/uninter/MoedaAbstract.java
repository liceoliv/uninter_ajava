package uninter;

//Classe mãe abstrata Moeda
abstract class MoedaAbstract {
 protected String nome;
 protected double valor;

 public MoedaAbstract(String nome, double valor) {
     this.nome = nome;
     this.valor = valor;
 }
 
 public void subtrairValor(double valor) {
     this.valor -= valor;
 }

 public String getNome() {
     return nome;
 }

 public double getValor() {
     return valor;
 }

 public abstract double converterParaReal();
}
