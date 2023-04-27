public class Main {
    public static void main(String[] args) {
        // Quadrilátero
        System.out.println("Exercício retornos");

       double areaQuadrado = quadrilatero.area(3);
        System.out.println("Área do Quadrado:" + areaQuadrado);

        double areaRetangulo = quadrilatero.area(5,5);
        System.out.println("Área do Retangulo:" + areaRetangulo);

        double areaTrapezio = quadrilatero.area(7,8,9);
        System.out.println("Área do Trapézio:" + areaTrapezio);
    }
}