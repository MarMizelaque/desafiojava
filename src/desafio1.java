import java.util.Scanner;

public class desafio1{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("digite seu nome:");
        String nome = leitor.nextLine();

        System.out.println("digite sua profissão");
        String profissao = leitor.nextLine();

        double[] salarios = new double[4];
        for(int i =0;i<salarios.length;i++){
            System.out.println("digite o valor do salário");
            salarios[i] = leitor.nextDouble();
        }

        while(true){
            System.out.println("digite uma opção");
            System.out.println("opção 0 sair");
            System.out.println(" opção 1 cadastrar usuário");
            System.out.println("opção 2 mostrar salários");
            System.out.println("opção 3 mostrar impostos");
            System.out.println("opção 4 mostrar dados do usuário");

            int condicao = leitor.nextInt();

            if(condicao == 0){
                System.exit(0);
            }else if(condicao == 1){
                System.out.println("cadastrar usuário");
            }else if(condicao==2){
                System.out.println("salários do mês");
                for(int i = 0;i<salarios.length;i++){
                    System.out.println("mês "+(i+1)+": "+salarios[i]);
                }
            } else if(condicao ==3){
                System.out.println("impostos do mês");
                double[] impostos = new double[salarios.length];
                for(int i=0;i<impostos.length;i++){
                    if (salarios[i] <= 2000.00) {
                        impostos[i] = 0.00;
                    } else if (salarios[i] <= 3000.00) {
                        impostos[i] = salarios[i] * 8 / 100;
                    } else if (salarios[i] <= 4500.00) {
                        impostos[i] = salarios[i] * 18 / 100;
                    } else {
                        impostos[i] = salarios[i] * 28 / 100;
                    }
                    System.out.println("mês" +(i+1)+": "+impostos[i]);
         
                }
            }else if(condicao == 4){
                System.out.println("dados do usuário");
                System.out.println("nome:  " +nome);
                System.out.println("profissão" +profissao);
            }else {
                System.out.println("opção inválida");
            }
        }
    }
}