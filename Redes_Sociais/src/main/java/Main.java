public class Main {
    public static void main(String[] args) {
        RedeSocial [] redesSociais = new RedeSocial[5];
        redesSociais[0] = new Facebook();
        redesSociais[1] = new GooglePlus();
        redesSociais[2] = new Twitter();
        redesSociais[3] = new Instagram();
        Usuario usuario = new Usuario(redesSociais);

        usuario.setNome("Mariana Barude");
        usuario.setEmail("mariana.barude@gec.inatel.br");
        for(int i = 0; i < usuario.redesSociais.length; i++){
            if(usuario.redesSociais != null){
                if(usuario.redesSociais[i] instanceof Instagram){
                    Instagram insta = (Instagram) redesSociais[i];
                    insta.setSenha("123456");
                    insta.setNumAmigos(351);
                    System.out.print("\nO usuario "+usuario.getNome()+" ");
                    insta.curtirPublicacao();
                    System.out.print(usuario.getNome()+" ");
                    insta.postarFoto();
                    System.out.print(usuario.getNome()+" ");
                    insta.postarComentario();
                }
                else if(usuario.redesSociais[i] instanceof GooglePlus){
                    GooglePlus gp = (GooglePlus) redesSociais[i];
                    gp.setSenha("123456");
                    gp.setNumAmigos(240);
                    System.out.print("\nO usuario "+usuario.getNome()+" ");
                    gp.postarVideo();
                    System.out.print(usuario.getNome()+" ");
                    gp.compartilhar();
                    System.out.print(usuario.getNome()+" ");
                    gp.fazStreaming();
                }
            }
        }
    }
}
