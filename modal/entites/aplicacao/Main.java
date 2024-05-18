    package modal.entites.aplicacao;
    import javax.xml.transform.Source;
    import java.io.IOException;
    import java.util.Scanner;
    import java.util.SortedMap;

    public class Main {

        public static void main(String[] args) throws IOException, InterruptedException {
            Scanner terminal = new Scanner(System.in);
            System.setProperty("file.encoding", "UTF-8");
            String valor= "";
            int opcao = 0;
            do {
                System.out.println("""
                        1) Dólar =>> Peso Argentino
                        2) Peso Argentino =>> Dólar
                        3) Dólar =>> Real Brasileiro
                        4) Real Brasileiro =>> Dólar
                        5) Dólar =>> Peso Colombiano
                        6) Peso Colombiano =>> Dólar
                        7) Sair do Sistema""");
                opcao = terminal.nextInt();
                switch (opcao) {
                    case 1:
                        try {
                            terminal.nextLine();
                            Double n = Requisicao.conversao("USD", "ARS");
                            System.out.println("Qual valor deseja converter?");

                            valor= terminal.nextLine();
                           Double novoValor= Double.valueOf(valor.replace(",", "."));
                            System.out.println("O valor após a conversão é " +novoValor*n);

                        } catch (NumberFormatException e) {
                            System.err.println(e.getMessage());

                        }
                    case 2:
                        try {
                            terminal.nextLine();
                            Double n = Requisicao.conversao("ARS", "USD");
                            System.out.println("Qual valor deseja converter?");

                            valor= terminal.nextLine();
                            Double novoValor= Double.valueOf(valor.replace(",", "."));
                            System.out.println("O valor após a conversão é " +novoValor*n);

                        } catch (NumberFormatException e) {
                            System.err.println(e.getMessage());

                        }
                    case 3:
                        try {
                            terminal.nextLine();
                            Double n = Requisicao.conversao("USD", "BRL");
                            System.out.println("Qual valor deseja converter?");

                            valor= terminal.nextLine();
                            Double novoValor= Double.valueOf(valor.replace(",", "."));
                            System.out.println("O valor após a conversão é " +novoValor*n);


                        } catch (NumberFormatException e) {
                            System.err.println(e.getMessage());

                        }
                    case 4:
                        try {
                            terminal.nextLine();
                            Double n = Requisicao.conversao("BRL", "USD");
                            System.out.println("Qual valor deseja converter?");

                            valor= terminal.nextLine();
                            Double novoValor= Double.valueOf(valor.replace(",", "."));
                            System.out.println("O valor após a conversão é " +novoValor*n);


                        } catch (NumberFormatException e) {
                            System.err.println(e.getMessage());

                        }
                    case 5:
                        try {
                            terminal.nextLine();
                            Double n = Requisicao.conversao("USD", "COP");
                            System.out.println("Qual valor deseja converter?");

                            valor= terminal.nextLine();
                            Double novoValor= Double.valueOf(valor.replace(",", "."));
                            System.out.println("O valor após a conversão é " +novoValor*n);


                        } catch (NumberFormatException e) {
                            System.err.println(e.getMessage());

                        }
                    case 6:
                        try {
                            terminal.nextLine();
                            Double n = Requisicao.conversao("COP", "USD");
                            System.out.println("Qual valor deseja converter?");

                            valor= terminal.nextLine();
                            Double novoValor= Double.valueOf(valor.replace(",", "."));
                            System.out.println("O valor após a conversão é " +novoValor*n);


                        } catch (NumberFormatException e) {
                            System.err.println(e.getMessage());

                        }
                    case 7:

                        System.out.println("saindo do Sistema");
                        break;
                    default:
                        System.out.println("Opcao invalida tente novamente\n\n");
                }
            }
            while(opcao!=7);

            System.out.println();



















            terminal.close();
        }}
