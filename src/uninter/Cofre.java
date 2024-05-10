package uninter;
import java.util.ArrayList;

class Cofre {
    private ArrayList<MoedaAbstract> moedas;

    public Cofre() {
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(MoedaAbstract moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(String nomeMoeda, double valorRemover) {
        boolean moedaEncontrada = false;
        for (MoedaAbstract moeda : moedas) {
            if (moeda.getNome().equalsIgnoreCase(nomeMoeda)) {
                if (moeda.getValor() >= valorRemover) {
                    moeda.subtrairValor(valorRemover);
                    moedaEncontrada = true;
                    break;
                } else {
                    System.out.println("Valor a ser removido excede o valor .");
                    return;
                }
            }
        }
        if (!moedaEncontrada) {
            System.out.println("Moeda não encontrada.");
        }
    }

    public void listarMoedas() {
        for (MoedaAbstract moeda : moedas) {
            System.out.println(moeda.getNome() + ": " + moeda.getValor());
        }
    }

    public double calcularTotalEmReal() {
        double total = 0;
        for (MoedaAbstract moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}