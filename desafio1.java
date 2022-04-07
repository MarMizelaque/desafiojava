import java.util.Scanner;

public class desafio1{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while(true){
System.out.println("digite seu nome");
            int condicao = leitor.nextInt();

            if(condicao == 0){
                System.out.println("sair");
            }else if(condicao == 1){
                System.out.println("cadastrar usuário");
            }else if(condicao==2){
                System.out.println("mostrar salários");
            } else if(condicao ==3){
                System.out.println("mostrar dados do usuário");
            }else {
                System.out.println("opção inválida");
            }
        }
    }
}