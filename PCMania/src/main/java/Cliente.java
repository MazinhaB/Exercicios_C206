public class Cliente {
    String nome; //nome do cliente
    long cpf; //cpf do usuário

    Computador []computadores = new Computador[10]; //computadores que o cliente deseja comprar

    //método para calcular o preço total dos computadores
    public float calculaTotalCompra(){
        float total = 0;
        for(int i = 0; i < this.computadores.length; i++)
            if(this.computadores[i] != null)//garante que não vai tentar somar o preço de uma posição vazia
                total+=this.computadores[i].preco;
        return total;
    }
}
