package br.inatel.poo.exercicio1.excecoes;

public class NotaInsuficienteException extends RuntimeException{
    public NotaInsuficienteException(String mensagem){
        super(mensagem);
    }
}
