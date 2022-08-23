public class Cliente {
    String nome;
    long cpf;

    Computador []computadores = new Computador[10];
    public float calculaTotalCompra(){
        float total = 0;
        for(int i = 0; i < this.computadores.length; i++)
            if(this.computadores[i] != null)
                total+=this.computadores[i].preco;
        return total;
    }
}
