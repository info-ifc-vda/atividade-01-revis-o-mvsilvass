public class CameraSeguranca extends Dispositivo implements Conectavel, Monitoravel, Atualizavel {
    private boolean gravando = false;
    private boolean conectadoWifi = false;

    public CameraSeguranca(int id, String localizacao) {
        super(id, localizacao);
    }

    @Override
    public void atualizarFirmware() {
        System.out.println("Atualizandooo....");
    }

    @Override
    public void gerarRelatorio() {
        super.exibirStatus();

        if (isGravando()) {
            System.out.println("Esta gravandooo...");
        } else {
            System.out.println("Nao esta gravandooo...");
        }
    }

    @Override
    public void funcionar() {
        if(super.isLigado()){
            System.out.println("Começando a gravaçao...");
            this.gravando = true;
        }else{
            System.out.println("Câmera desligada!");
        }
    }

    public void pararGravacao(){
        if(super.isLigado()){
            System.out.println("Parando a gravaçao...");
            this.gravando = false;
        }
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando ao Wifi....");
        this.conectadoWifi = true;
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Desconectando ao Wifi....");
        this.conectadoWifi = false;
    }

    public boolean isConectadoWifi() {
        return conectadoWifi;
    }

    public boolean isGravando() {
        return gravando;
    }
}
