public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao(){
        System.out.print("curtiu uma publicacao ");
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }
}
