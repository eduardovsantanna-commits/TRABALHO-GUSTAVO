package org.example;

import org.example.utilities.Carro;
import org.example.utilities.Estacionamento;
import org.example.utilities.Veiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ativo = true;

        do {
            try {
                System.out.println("\n========================");
                System.out.println("1 - Estacionar Veiculo;");
                System.out.println("2 - Encontrar Veiculo;");
                System.out.println("3 - Retirar Veiculo;");
                System.out.println("4 - Lista de Veículos;");
                System.out.println("5 - Sair;");
                System.out.println("------------------------");
                System.out.print("Opção: ");

                // Lendo como linha inteira evita TODOS os bugs de buffer do Scanner
                String entrada = sc.nextLine();
                int res = Integer.parseInt(entrada);

                switch (res) {
                    case 1:
                        System.out.print("INSIRA A PLACA DO VEÍCULO (XXXX-YYY): ");
                        String plate1 = sc.nextLine();
                        Carro c = new Carro(plate1);
                        Estacionamento.estacionarVeiculo(c);
                        break;

                    case 2:
                        System.out.println("====================");
                        System.out.print("Indique a placa para buscar: ");
                        String plate = sc.nextLine();

                        Veiculo veiculoEncontrado = Estacionamento.encontrarVeiculoPorPlaca(plate);

                        if (veiculoEncontrado != null) {
                            System.out.println("Dados do veículo obtidos com sucesso: " + veiculoEncontrado.toString());
                        }
                        break;

                    case 5:
                        ativo = false;
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida! Digite um número de 1 a 5.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Você digitou letras no menu. Digite apenas números.");
            } catch (Exception e) {
                // Se der qualquer outro erro no sistema, o Java vai te avisar aqui!
                System.out.println("Ops, deu ruim: " + e.getMessage());
                e.printStackTrace();
            }
        } while (ativo);

        sc.close();
    }
}