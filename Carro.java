package org.example.utilities;

public class Carro extends Veiculo {

    private String modelo;

    public Carro(String plate, String color, String tipo, String modelo) {
        super(plate, color, tipo);
        this.modelo = modelo;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String toString(Veiculo veiculo){
        return veiculo.getPlate() + " " + veiculo.getColor() + " " + veiculo.getTipo();
    }
}
