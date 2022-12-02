import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Voto> votos = new ArrayList<Voto>(); // Contém os votos computados
        ArrayList<Candidato> candidatos = new ArrayList<Candidato>(); // Contém os cadidatos disponíveis para votação
        Arquivo arq = new Arquivo();
        Scanner in = new Scanner(System.in);  // Scanner para a entrada dos dados

        Voto voto = new Voto();
        String cpf = "";             // Cpf do eleitor
        int numeroCandidato = 0;    // Candidato votado

        int op;       // Flag para o loop que realiza a entrada dos dados
        boolean cpfFlag = true;                // Flag para entrada do CPF
        boolean numeroCandidatoFlag = true; // Flag para o número do candidato

        candidatos.add(new Candidato("Paulinho Anao", 77));
        candidatos.add(new Candidato("Rogerao", 51));
        candidatos.add(new Candidato("Darth Verde", 43));

        // Verifica se haverá uma pesquisa
        System.out.println("\nCaso, deseje fazer uma pesquisa de voto digite 1,");
        System.out.println("Caso contrario, digite 0: ");
        op = in.nextInt();
        while(op != 0){

            // Tratamento na entrada do CPF
            while(cpfFlag) {
                System.out.println("Inserir CPF:");
                in.nextLine();
                cpf = in.nextLine();

                // Verifica se o CPF está válido
                try {
                    Voto.verificarCpf(cpf);
                    if (!Voto.verificarCpf(cpf) || cpf.length() != 11) {
                        throw new CPFInvalidoException();
                    }
                    cpfFlag = false;
                } catch (CPFInvalidoException e) {
                    cpfFlag = true;
                    System.out.println("Insira novamente o CPF");
                }
            }
            cpfFlag = true;
            // Tratamento na entrada do numero do candidato
            while(numeroCandidatoFlag){
                System.out.println("Inserir numero do candidato:");
                numeroCandidato = in.nextInt();

                try {
                    for (Candidato c : candidatos) {
                        if (c.getNumero() == numeroCandidato) {
                            numeroCandidatoFlag = false;
                        }
                    }

                    if(numeroCandidatoFlag)
                        throw new CandidatoInvalidoException();
                }catch (CandidatoInvalidoException e){
                    System.out.println("Insira novamente o numero de um candidato valido");
                }
            }
            numeroCandidatoFlag = true;
            votos.add(new Voto(cpf, numeroCandidato));

            // Verifica se haverá outra pesquisa
            System.out.println("\nCaso, deseje fazer uma nova pesquisa de voto digite 1,");
            System.out.println("Caso contrario, digite 0: ");

            op = in.nextInt();
        }

        arq.escrever(votos, candidatos);

    }
}
