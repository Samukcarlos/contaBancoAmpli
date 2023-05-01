import java.util.Locale;
import java.util.Scanner;

public class GerenciaBanco2{
    public static void main(String[] args) {
        contaBanco operacoes;
        aplicarBanco aplicarBanco;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja Benvindo ao Banco Ampli");
        System.out.println("informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("informe seu sobre nome: ");
        String sobreNome = sc.nextLine();
        System.out.println("informe seu cpf: ");
        Double cpf = sc.nextDouble();

        System.out.println("Você desja realizar que tipo de transação?: ");
        System.out.println("1 para Transações comuns, 2 para Investimentos e 3 para sair");
        Double transacao = sc.nextDouble();

        if (transacao == 1) {

            Integer op;
            Double deposito = null;
            Double retirada = null;
            Double saldo = null;
            Double a = 0.0;
            do {

                System.out.println("Escolha a opção:");
                System.out.println("1 para consulta de saldo, 2 para depósito, 3 para saque e 4 para sair");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Seu saldo é " + saldo);
                        break;
                    case 2:
                        System.out.println("Qual valor deseja depositar? ");
                        deposito = sc.nextDouble();
                        a += deposito;
                        saldo = a;

                        System.out.println("Seu saldo atual é " + saldo);

                        break;
                    case 3:
                        System.out.println("Qual valor deseja sacar ? ");
                        retirada = sc.nextDouble();
                        saldo -= retirada;
                        System.out.println("Seu saldo atual é " + saldo);
                        break;

                    case 4:
                        System.out.println("Muito obrigado por utilizar nossos serviços ");
                        break;

                    default:
                        System.out.println("Valor inválido");
                        break;

                }
            }
            while (op != 4);
        }

        if  (transacao == 2){

            Integer op2;

            System.out.println("Escolha a opção:");
            System.out.println("1 para CDB e 2 para LCI");
            op2 = sc.nextInt();

            int meses = 0;
            double invCDB = 0;
            int meses2 = 0;
            double invLCI = 0;

            switch (op2) {

                case 1:

                    System.out.println("Qual valor deseja investir?");
                    invCDB = sc.nextDouble();
                    System.out.println("Por quantos meses?");
                    meses = sc.nextInt();
                    aplicarBanco ap1 = new aplicarBanco(invCDB, meses, invLCI, meses2);
                   // aplicarBanco ap1 = new aplicarBanco(invCDB, meses);

                    //double X = (invCDB * meses);
                    //double cdb = ((X) / 12) * 0.1;
                    //double totalCDB = cdb + (X);
                    System.out.println("O Rendimento deste investimento em um ano será: " + ap1.cdb());
                    System.out.println("Você investirá: " + invCDB + " Reais por " + meses + " meses, Totalizando " + (ap1.X()) + " Reais Investidos");
                    System.out.println("Ao final de um ano você terá acumulado: " + ap1.totalCDB() + " Reais");
                    break;
                case 2:
                    System.out.println("Qual valor deseja investir?");
                    invLCI= sc.nextDouble();
                    System.out.println("Por quantos meses?");
                    meses2 = sc.nextInt();
                    aplicarBanco ap2 = new aplicarBanco(invCDB, meses, invLCI, meses2);
                   // aplicarBanco ap2 = new aplicarBanco(invLCI, meses2);

                    //double Y = (invLCI * meses2);
                    //double lci = ((Y) / 12) * 0.08;
                    //double totalLCI = lci + (Y);
                    System.out.println("O Rendimento deste investimento em um ano será: " + ap2.lci());
                    System.out.println("Você investirá: " + invLCI + " Reais por " + meses2 + " meses Totalizando " + (ap2.Y()) + " Investidos");
                    System.out.println("Ao final de um ano você terá acumulado: " + ap2.totalLCI() + " Reais");
                    break;

                case 3:
                    System.out.println("Muito obrigado por utilizar nossos serviços ");
                    break;

                default:
                    System.out.println("Valor inválido");
                    break;
            }
    }
        else {System.out.println("Valor inválido");

        }
}
}