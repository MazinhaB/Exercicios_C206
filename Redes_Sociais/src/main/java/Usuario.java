public class Usuario {
    private String nome;
    private String email;
    RedeSocial[] redesSociais;

    public Usuario(RedeSocial[] redesSociais){
        this.redesSociais = redesSociais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome(){
        return this.nome;
    }
}
