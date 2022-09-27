public class Facebook extends RedeSocial implements videoConferencia, Compartilhamento{
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma foto no Facebook");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez um streaming no Facebook");
    }
    @Override
    public void curtirPublicacao(){
        super.curtirPublicacao();
        System.out.println("no Facebook");
    }
}
