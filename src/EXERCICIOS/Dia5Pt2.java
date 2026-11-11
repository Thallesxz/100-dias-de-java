public class Dia5Pt2 {
    public static void main(String[] args) {
        double salario = 8000;
        double porcentagem;

        if (salario>4500) {
            porcentagem = 30;
        }
        else porcentagem = 15;

        double resultado = (porcentagem / 100) * salario;

        System.out.println("resultado: " + resultado);

    }
}