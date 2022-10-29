package br.inatel.poo.exercicio1;
import br.inatel.poo.exercicio1.excecoes.NomeRepetidoException;
import br.inatel.poo.exercicio1.excecoes.NotaInsuficienteException;

import java.util.HashMap;

public class Fetin {
    private HashMap<String, Double> projetos = new HashMap<>();

    public void cadastraGrupo(String nome, double nota) throws NomeRepetidoException {
        Double aux = projetos.get(nome);
       if(aux != null)
           throw new NomeRepetidoException("O nome " +nome +" ja foi usado por outra equipe");
       else {
               projetos.put(nome, nota);
               System.out.println("Nome "+nome+" cadastrado para a nova equipe");
       }
    }
    public void aprovados(String nome){
        Double nota = projetos.get(nome);
            if (nota >= 60)
                System.out.println(nome + " aprovada!!");
            else
                throw new NotaInsuficienteException(nome + " nao obteve nota suficiente para aprovacao");
    }
    public void mostraProjetos(){
        projetos.forEach((nome, nota) -> {
            System.out.println("Nome do projeto: "+nome);
            System.out.println("Nota da equipe: "+nota+"\n");
        });
    }
}
