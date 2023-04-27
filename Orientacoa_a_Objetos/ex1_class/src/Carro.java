public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro() {

    }
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String azul) {
        this.cor = "Azul";
    }

    String getCor() {
        return cor;
    }

    void setModelo() {
        this.modelo = "BMW Série 3";
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque() {
        this.capacidadeTanque = 59;

    }

     int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(int valorCombustivel){
        return capacidadeTanque = valorCombustivel;
    }


}
