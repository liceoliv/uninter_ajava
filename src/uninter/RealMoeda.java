package uninter;

class RealMoeda extends MoedaAbstract {
    public RealMoeda(double valor) {
        super("Real", valor);
    }

    @Override
    public double converterParaReal() {
        return valor;
    }
}