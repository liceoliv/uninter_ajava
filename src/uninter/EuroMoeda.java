package uninter;

class EuroMoeda extends MoedaAbstract {
    public EuroMoeda(double valor) {
        super("Euro", valor);
    }

    @Override
    public double converterParaReal() {
        return valor * 5.54;
    }
}
