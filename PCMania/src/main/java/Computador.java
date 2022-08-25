public class Computador {
    String marca; //marca do computador
    float preco; //preco total do computador

    //cada computador tem:
    MemoriaUSB MUSB; //uma memória USB
    SistemaOperacional SO; //um sistema operacional
    HardwareBasico[] HB = new HardwareBasico[3]; //3 hardwares básicos

    public Computador(){
        SO = new SistemaOperacional();
    } //construtor para adicionar o Sistema Operacional

    //método que mostra as informações do computador e de tudo que ele possui
    public void mostraPCConfigs(){
        System.out.println("\nMarca do Computador: "+this.marca);
        System.out.println("Preco: R$"+this.preco);
        System.out.println("\n--- Memoria USB ---");
        System.out.println("Nome da memoria USB: "+this.MUSB.nome);
        System.out.println("Capacidade da memoria USB: "+this.MUSB.capacidade);
        System.out.println("\n--- Sistema Operacional ---");
        System.out.println("Nome do Sistema Operacional: "+this.SO.nome);
        System.out.println("Tipo do Sistema Operacional: "+this.SO.tipo);
        System.out.println("\n--- Hardware Basico ---");
        for(int i = 0; i < HB.length; i++)
            if(HB[i] != null) {
                System.out.println("Nome do Hardware " +(i+1)+": "+this.HB[i].nome);
                System.out.println("Capacidade do Hardware "+i+": "+this.HB[i].capacidade);
            }
    }
    public void addMemoriaUSB(MemoriaUSB musb){
        this.MUSB = musb;
    }//método para adicionar uma memória USB
}
