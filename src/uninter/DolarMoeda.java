package uninter;

//Classes filhas concretas
class DolarMoeda extends MoedaAbstract {
	 public DolarMoeda(double valor) {
	     super("Dólar", valor);
	 }
	
	 @Override
	 public double converterParaReal() {
	     return valor * 5.14;
	 }
}
