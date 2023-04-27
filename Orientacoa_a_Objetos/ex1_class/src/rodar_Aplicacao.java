public class rodar_Aplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo();
        carro1.setCapacidadeTanque();

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque((int) 6.39));

        Carro carro2 = new Carro("Cinza", "Mercedes-Bens Classe C", 66);

        System.out.println(carro2. getModelo());
        System.out.println(carro2. getCor());
        System.out.println(carro2. getCapacidadeTanque());
        System.out.println(carro2. totalValorTanque((int) 6.46));

    }
}
