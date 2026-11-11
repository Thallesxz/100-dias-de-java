public class Dia1 {
    public static void main(String[] args){
        int idade = 7;
        System.out.println(idade + " eh a idade dele");
        if (idade >= 18){
            System.out.println("Status: Maior de idade. Acesso autorizado.");
            System.out.println("Nível: Administrador.");
        } else {
            System.out.println("Status: Menor de idade. Acesso negado.");
            System.out.println("Nível: Visitante.");
        }
    }
}
