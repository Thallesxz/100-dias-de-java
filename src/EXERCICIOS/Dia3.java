public class Dia3 {
    public static void main(String[] args) {
        double salario = 1500;
        double porcentagem = 30;
        double resultado = (porcentagem / 100) * salario;
        System.out.println("Esse é o resultado de 30: " + resultado);
        porcentagem = 15;
        resultado = (porcentagem / 100) * salario;
        System.out.println("Resultado com 15:" + resultado);
        porcentagem = 5;
        resultado = (porcentagem / 100) * salario;
        System.out.println("Resultado com 5:" + resultado);
    }
}
