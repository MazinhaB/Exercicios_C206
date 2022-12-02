public class Voto {
    private String cpf;
    private int numeroCandidato;
    public Voto(String cpf, int numeroCandidato){
        this.cpf = cpf;
        this.numeroCandidato = numeroCandidato;
    }

    public Voto() {
    }

    // Função para verificar se um CPF é válido
    public static boolean verificarCpf(String cpf){
        try{
            long novoCpf = Long.parseLong(cpf);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }
}
