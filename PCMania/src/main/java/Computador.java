public class Computador {
    String marca;
    float preco;

    MemoriaUSB MUSB;
    SistemaOperacional SO;
    HardwareBasico[] HB = new HardwareBasico[3];

    public Computador(){
        SO = new SistemaOperacional();
    }
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
    }
}
