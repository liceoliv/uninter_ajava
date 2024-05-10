package uninter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofre cofre = new Cofre();

        int opcao;
        do {
            System.out.println("Menu:");
            
            System.out.println("1 - Adicionar Valor de uma Moeda");
            
            System.out.println("2 - Remover Valor de uma moeda");
            
            System.out.println("3 - Calcular total em Real ");
            
            System.out.println("4 - Listar moedas");
            
            System.out.println("0 - Sair");
            
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                	
                	System.out.print("Digite o a moeda (Dólar, Euro, Real): ");
                    String nomeMoeda = scanner.next();
                    
                    System.out.print("Digite o valor da moeda: ");
                    double valorMoeda = scanner.nextDouble();
                    
                    MoedaAbstract novaMoeda = null;
                    switch (nomeMoeda) {
                        case "Dólar":
                            novaMoeda = new DolarMoeda(valorMoeda);
                            break;
                        case "Euro":
                            novaMoeda = new EuroMoeda(valorMoeda);
                            break;
                        case "Real":
                            novaMoeda = new RealMoeda(valorMoeda);
                            break;
                        default:
                            System.out.println("Moeda não reconhecida.");
                            break;
                    }
                    if (novaMoeda != null) {
                        cofre.adicionarMoeda(novaMoeda);
                        System.out.println("Moeda adicionada com sucesso.");
                    }

                    break;
                case 2:
                	System.out.print("Digite o nome da moeda: ");
                    String nomeMoedaString = scanner.next();
                    
                    System.out.print("Digite o valor a ser removido: ");
                    double valorRemover = scanner.nextDouble();
                    
                    cofre.removerMoeda(nomeMoedaString, valorRemover);

                    break;
                case 3:
                	double totalEmReal = cofre.calcularTotalEmReal();
                    System.out.println("Total em Real: " + totalEmReal);
                   
                    break;
                case 4:
                	cofre.listarMoedas();

                    break;
                case 0:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Opção não encontrada, tente novamente!.");
                    break;
            }
        } while (opcao != 0);
        scanner.close();
    }
}
