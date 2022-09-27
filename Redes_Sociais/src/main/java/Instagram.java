public class Instagram extends RedeSocial {
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentou em uma publicacao no Instagram");
    }
    @Override
    public void curtirPublicacao(){
        super.curtirPublicacao();
        System.out.println("no Instagram");
    }
}
