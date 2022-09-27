public class GooglePlus extends RedeSocial implements Compartilhamento, videoConferencia{
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma foto no GooglePlus");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez um streaming no GooglePlus");
    }
    @Override
    public void curtirPublicacao(){
        super.curtirPublicacao();
        System.out.println("no GooglePlus");
    }
}
