abstract class Dispositivo {
    private int id;
    private String localizacao;
    private boolean ligado = false;

    public Dispositivo(int id, String localizacao){
        this.localizacao = localizacao;
        this.id = id;
    }

    public void ligar() {
        System.out.println("Ligandoo....");
        this.ligado = true;
    }

    public void desligado() {
        System.out.println("Desligandoo....");
        this.ligado = false;
    }

    public void exibirStatus() {
        System.out.println("--------------------------------------------------");
        System.out.println("Id: " + this.id);
        System.out.println("Localização: " + this.localizacao);

        if(this.ligado){
            System.out.println("Estou ligado...");
        }else{
            System.out.println("Estou desligado...");
        }
    }

    public abstract void funcionar();

    public boolean isLigado() {
        return ligado;
    }

}