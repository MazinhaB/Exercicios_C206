import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Scanner para a entrada de dados
        int op; //opcao de promoção
        int cont = 0; //contador de computadores
        float total = 0;//recebe o retorno do método da classe Cliente que calcula o total da compra
        Cliente cliente = new Cliente();//cria um novo cliente

        //cadastro do cliente
        System.out.println("\nSeja bem vindo a PCMania.\nVamos rapidamente cadastrar algumas informacoes");
        System.out.print("Digite seu nome: ");
        cliente.nome = in.nextLine();
        System.out.print("Digite seu CPF: ");
        cliente.cpf = in.nextLong();

        //escolha da promoção
        System.out.println("\nEh seu dia de sorte! Estamos em queima de estoque. Temos as seguintes promocoes:");
        System.out.println("Promocao 1 - Positivo");
        System.out.println("Promocao 2 - Acer");
        System.out.println("Promocao 3 - Vaio");
        System.out.println("(Digite 0 para sair)");
        System.out.print("Qual promocao deseja? ");
        op = in.nextInt();

        //loop para n compras
        while(op != 0) {
            switch (op) { //escolha da promoção
                case 1 -> { //Computador Positivo
                    cliente.computadores[cont] = new Computador();
                    cliente.computadores[cont].marca = "Positivo";
                    cliente.computadores[cont].preco = 1300f;
                    cliente.computadores[cont].HB[0] = new HardwareBasico();
                    cliente.computadores[cont].HB[0].nome = "Pentium Core i3";
                    cliente.computadores[cont].HB[0].capacidade = 1200;
                    cliente.computadores[cont].HB[1] = new HardwareBasico();
                    cliente.computadores[cont].HB[1].nome = "Memoria RAM";
                    cliente.computadores[cont].HB[1].capacidade = 4;
                    cliente.computadores[cont].HB[2] = new HardwareBasico();
                    cliente.computadores[cont].HB[2].nome = "HD";
                    cliente.computadores[cont].HB[2].capacidade = 500;
                    cliente.computadores[cont].SO.nome = "Linux Ubuntu";
                    cliente.computadores[cont].SO.tipo = 32;
                    MemoriaUSB memoriaUSB = new MemoriaUSB();
                    memoriaUSB.nome = "Pen-Drive";
                    memoriaUSB.capacidade = 16;
                    cliente.computadores[cont].addMemoriaUSB(memoriaUSB);
                    cont++;
                }
                case 2->{//Computador Acer
                    cliente.computadores[cont] = new Computador();
                    cliente.computadores[cont].marca = "Acer";
                    cliente.computadores[cont].preco = 1800f;
                    cliente.computadores[cont].HB[0] = new HardwareBasico();
                    cliente.computadores[cont].HB[0].nome = "Pentium Core i5";
                    cliente.computadores[cont].HB[0].capacidade = 2260;
                    cliente.computadores[cont].HB[1] = new HardwareBasico();
                    cliente.computadores[cont].HB[1].nome = "Memoria RAM";
                    cliente.computadores[cont].HB[1].capacidade = 8;
                    cliente.computadores[cont].HB[2] = new HardwareBasico();
                    cliente.computadores[cont].HB[2].nome = "HD";
                    cliente.computadores[cont].HB[2].capacidade = 1;
                    cliente.computadores[cont].SO.nome = "Windows 8";
                    cliente.computadores[cont].SO.tipo = 64;
                    MemoriaUSB memoriaUSB = new MemoriaUSB();
                    memoriaUSB.nome = "Pen-Drive";
                    memoriaUSB.capacidade = 32;
                    cliente.computadores[cont].addMemoriaUSB(memoriaUSB);
                    cont++;
                }
                case 3->{//Computador Vaio
                    cliente.computadores[cont] = new Computador();
                    cliente.computadores[cont].marca = "Vaio";
                    cliente.computadores[cont].preco = 2800f;
                    cliente.computadores[cont].HB[0] = new HardwareBasico();
                    cliente.computadores[cont].HB[0].nome = "Pentium Core i7";
                    cliente.computadores[cont].HB[0].capacidade = 3500;
                    cliente.computadores[cont].HB[1] = new HardwareBasico();
                    cliente.computadores[cont].HB[1].nome = "Memoria RAM";
                    cliente.computadores[cont].HB[1].capacidade = 16;
                    cliente.computadores[cont].HB[2] = new HardwareBasico();
                    cliente.computadores[cont].HB[2].nome = "HD";
                    cliente.computadores[cont].HB[2].capacidade = 2;
                    cliente.computadores[cont].SO.nome = "Windows 10";
                    cliente.computadores[cont].SO.tipo = 64;
                    MemoriaUSB memoriaUSB = new MemoriaUSB();
                    memoriaUSB.nome = "HD Externo";
                    memoriaUSB.capacidade = 1;
                    cliente.computadores[cont].addMemoriaUSB(memoriaUSB);
                    cont++;
                }
                default->
                    System.out.println("Opcao invalida.");
            }

            System.out.print("Deseja aproveitar mais alguma promocao? (Digite 0 para sair) ");
            System.out.println("\nPromocao 1 - Positivo");
            System.out.println("Promocao 2 - Acer");
            System.out.println("Promocao 3 - Vaio");
            op = in.nextInt();
        }
        //Saída das informações
        if(cont == 0)
            System.out.println("Nenhuma compra foi efetuada");
        else {
            System.out.println("Compras finalizadas");
            System.out.println("\n--- Informacoes do Cliente ---");
            System.out.println("Nome: " + cliente.nome);
            System.out.println("CPF: " + cliente.cpf);
            System.out.println("\n--- Informacoes do(s) Computador(es) ---");
            for (int i = 0; i < cliente.computadores.length; i++)
                if (cliente.computadores[i] != null)
                    cliente.computadores[i].mostraPCConfigs();
            total = cliente.calculaTotalCompra();
            System.out.println("\nTotal da Compra: R$" + total);
        }
        in.close();
    }
}
