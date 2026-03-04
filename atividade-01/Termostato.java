public class Termostato extends Dispositivo implements Monitoravel, Conectavel {
    private double temperaturaAtual;
    private double temperaturaAlvo;
    private boolean conectadoWifi = false;

    public Termostato(int id, String localizacao, double temperaturaAtual, double temperaturaAlvo) {
        super(id, localizacao);
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaAlvo = temperaturaAlvo;
    }

    @Override
    public void gerarRelatorio() {
        super.exibirStatus();
        System.out.println("Temperatura atual: " + this.temperaturaAtual);
    }

    @Override
    public void funcionar() {

        if (super.isLigado()) {

            while (this.temperaturaAtual < this.temperaturaAlvo) {
                this.temperaturaAtual++;
                System.out.println("Aumentando... Temperatura atual: " + this.temperaturaAtual + "°C");
            }


            while (this.temperaturaAtual > this.temperaturaAlvo) {
                this.temperaturaAtual--;
                System.out.println("Diminuindo... Temperatura atual: " + this.temperaturaAtual + "°C");
            }

            System.out.println("Temperatura ideal atingida: " + this.temperaturaAtual + "°C");
        } else {
            System.out.println("Termostato desligado. Ligue para ajustar a temperatura.");
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

}
