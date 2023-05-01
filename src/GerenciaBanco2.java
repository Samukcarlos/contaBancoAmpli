import java.util.Locale;
import java.util.Scanner;

public class GerenciaBanco2{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja Benvindo ao Banco Ampli");
        System.out.println("informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("informe seu sobre nome: ");
        String sobreNome = sc.nextLine();
        System.out.println("informe seu cpf: ");
        Double cpf = sc.nextDouble();

        System.out.println(nome + " que tipo de transação desja realizar?: ");
        System.out.println("1 para Transações comuns, 2 para Investimentos, 3 para Calculadora e 4 para sair");
        Double transacao = sc.nextDouble();

        if (transacao == 1) {

            Integer op;
            Double deposito = null;
            Double retirada = null;
            Double saldo = null;
            Double a = 0.0;
            do {

                System.out.println(nome + " Escolha uma das opçãos:");
                System.out.println("1 para consulta de saldo, 2 para depósito, 3 para saque e 4 para sair");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Seu saldo é " + saldo);
                        break;
                    case 2:
                        System.out.println(nome + " Qual valor deseja depositar? ");
                        deposito = sc.nextDouble();
                        a += deposito;
                        saldo = a;

                        System.out.println(nome + " Seu saldo atual é " + saldo);

                        break;
                    case 3:
                        System.out.println("Qual valor deseja sacar ? ");
                        retirada = sc.nextDouble();
                        saldo -= retirada;
                        System.out.println(nome + " Seu saldo atual é " + saldo);
                        break;

                    case 4:
                        System.out.println(nome + " Muito obrigado por utilizar nossos serviços ");
                        break;

                    default:
                        System.out.println("Valor inválido");
                        break;
                }
            }
            while (op != 4);
        }

        if (transacao == 2) {

            Integer op2;

            System.out.println(nome + " Escolha a opção:");
            System.out.println("1 para CDB e 2 para LCI");
            op2 = sc.nextInt();

            int meses = 0;
            double invCDB = 0;
            int meses2 = 0;
            double invLCI = 0;

            switch (op2) {

                case 1:

                    System.out.println(nome + " Qual valor deseja investir?");
                    invCDB = sc.nextDouble();
                    System.out.println("Por quantos meses?");
                    meses = sc.nextInt();
                    aplicarBanco ap1 = new aplicarBanco(invCDB, meses, invLCI, meses2);

                    System.out.println(nome + " O Rendimento deste investimento em um ano será: " + ap1.cdb());
                    System.out.println("Você investirá: " + invCDB + " Reais por " + meses + " meses, Totalizando " + (ap1.X()) + " Reais Investidos");
                    System.out.println("Ao final de um ano você terá acumulado: " + ap1.totalCDB() + " Reais");
                    break;
                case 2:
                    System.out.println(nome + " Qual valor deseja investir?");
                    invLCI = sc.nextDouble();
                    System.out.println("Por quantos meses?");
                    meses2 = sc.nextInt();
                    aplicarBanco ap2 = new aplicarBanco(invCDB, meses, invLCI, meses2);

                    System.out.println(nome + " O Rendimento deste investimento em um ano será: " + ap2.lci());
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
        if (transacao == 3) {
            Integer cal;
            System.out.println(nome + " Escolha a opção:");
            System.out.println("1 para adição, 2 para subtração, 3 para multiplicação, 4 para divisão, 5 para radiciação e 6 para sair");
            cal = sc.nextInt();


            switch (cal) {

                case 1:

                    System.out.println("digite dois numeros separados por enter:");
                    double soma1 = sc.nextDouble();
                    double soma2 = sc.nextDouble();

                    calculos calc1 = new calculos(soma1, soma2);
                    System.out.println("resultado: " + calc1.soma());
                    break;
                case 2:
                    System.out.println(" digite dois numeros separados por enter:");
                    double sub1 = sc.nextDouble();
                    double sub2 = sc.nextDouble();
                    calculos calc2 = new calculos(sub1, sub2);
                    System.out.println("resultado: " + calc2.sub());
                    break;
                case 3:
                    System.out.println("digite dois numeros separados por enter:");
                    double mult1 = sc.nextDouble();
                    double mult2 = sc.nextDouble();
                    calculos calc3 = new calculos(mult1, mult2);
                    System.out.println("resultado: " + calc3.mult());
                    break;
                case 4:
                    System.out.println("digite dois numeros DIFERENTES DE ZERO separados por enter:");
                    double div1 = sc.nextDouble();
                    double div2 = sc.nextDouble();
                    if (div1 == 0) {
                        System.out.println("valor não permitido ");
                    }

                    calculos calc4 = new calculos(div1, div2);
                    System.out.println("resultado: " + calc4.div());
                    break;
                case 5:
                    System.out.println("digite um numeros");
                    double rad1 = sc.nextDouble();
                    calculos calc5 = new calculos(rad1);
                    System.out.println("resultado: " + calc5.rad());
                    break;
                case 6:
                    System.out.println("Muito Obrigado por utilizar nossos serviços");
                    break;
            }

        }
        if (transacao == 4) {
            System.out.println("Muito Obrigado por utilizar nossos serviços");
        } else {
            System.out.println("Muito Obrigado por utilizar nossos serviços");

        }
    }
}
