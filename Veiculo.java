package org.example.utilities;

public abstract class Veiculo {
     private String plate;
     private String color;
     private String tipo;

     public Veiculo() {

     }

     public Veiculo(String plate, String color, String tipo) {
         this.plate = plate;
         this.color = color;
         this.tipo = tipo;
     }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


     
}