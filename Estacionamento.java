package org.example.utilities;

public class Estacionamento {
    public static Veiculo[] veiculos = new Veiculo[10];
    private static int vagas = 10;

    public static Veiculo encontrarVeiculoPorPlaca(String plate) {
        for (int i = 0; i < veiculos.length; i++) {
            // Verifica se a vaga NÃO é nula antes de verificar a placa
            if (veiculos[i] != null && veiculos[i].getPlate().equalsIgnoreCase(plate)) {
                System.out.println("Veiculo encontrado:\n" + veiculos[i].toString());
                return veiculos[i]; // Encerra o método assim que encontrar
            }
        }

        // Se o loop terminar e não atingir o 'return', o veículo não está lá
        System.out.println("%ERROR% Veículo não encontrado.");
        return null;
    }

    public static void estacionarVeiculo(Veiculo veiculo) {
        // 1. Verifica se o estacionamento está lotado
        if (vagas <= 0) {
            System.out.println("Erro: Estacionamento lotado.");
            return;
        }

        // 2. Verifica todo o estacionamento para garantir que o veículo já não está lá
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null && veiculos[i].getPlate().equalsIgnoreCase(veiculo.getPlate())) {
                System.out.println("Erro: Já existe um veículo com esta placa no estacionamento.");
                return;
            }
        }

        // 3. Encontra a primeira vaga vazia e estaciona o veículo
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                veiculos[i] = veiculo;
                vagas--;
                System.out.println("Veiculo estacionado!\nVagas disponíveis: " + vagas + "\nLocal Estacionado: " + i);
                return;
            }
        }
    }
}