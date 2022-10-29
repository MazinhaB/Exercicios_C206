package br.inatel.poo.exercicio1;
import br.inatel.poo.exercicio1.excecoes.NomeRepetidoException;
import br.inatel.poo.exercicio1.excecoes.NotaInsuficienteException;

public class Main {
    public static void main(String[] args) throws NomeRepetidoException {
        Fetin f1 = new Fetin();

        // Cadastros das equipes
        try{
            f1.cadastraGrupo("Equipe1", 55);
        }catch(NomeRepetidoException e){
            System.out.println(e.getMessage());
        }
        try{
            f1.cadastraGrupo("Equipe2", 90);
        }catch(NomeRepetidoException e){
            System.out.println(e.getMessage());
        }
        try{
            f1.cadastraGrupo("Equipe2", 87);
        }catch(NomeRepetidoException e){
            System.out.println(e.getMessage());
        }
        try{
            f1.cadastraGrupo("Equipe3", 87);
        }catch(NomeRepetidoException e){
            System.out.println(e.getMessage());
        }
        try{
            f1.cadastraGrupo("Equipe4", 68);
        }catch(NomeRepetidoException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Verifica se as equipes obtiveram aprovação
        try {
            f1.aprovados("Equipe1");
        }catch(NotaInsuficienteException e){
            System.out.println(e.getMessage());
        }
        try {
            f1.aprovados("Equipe2");
        }catch(NotaInsuficienteException e){
            System.out.println(e.getMessage());
        }
        try {
            f1.aprovados("Equipe3");
        }catch(NotaInsuficienteException e){
            System.out.println(e.getMessage());
        }
        try {
            f1.aprovados("Equipe4");
        }catch(NotaInsuficienteException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Mostra os projetos e suas notas
        f1.mostraProjetos();

        System.out.println("Final do programa");
    }
}
