import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public void escrever(ArrayList<Voto> votos, ArrayList<Candidato> candidatos){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        String linha;

        for (Candidato c: candidatos) {
            try{
                os = new FileOutputStream(c.getNome() + ".txt", true);   // true - Escreve na frente, false - Sobrescreve
                osw = new OutputStreamWriter(os);
                bw = new BufferedWriter(osw);

                for (Voto v: votos) {
                    if(v.getNumeroCandidato() == c.getNumero()){
                        bw.write(v.getCpf() + "\n");
                    }
                }
            }
            catch (Exception e){
                System.out.println(e);
            }finally{
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
