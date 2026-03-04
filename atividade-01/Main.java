import java.util.List;

public class Main {
    public static void main(String[] args) {

        LampadaInteligente lampada = new LampadaInteligente(1, "Sala de Estar", "Branca", 80);
        Termostato termostato = new Termostato(2, "Quarto Principal", 22.5, 10.5);
        CameraSeguranca camera = new CameraSeguranca(3, "Corredor Externo");

        List<Dispositivo> dispositivos = List.of(lampada, termostato, camera);

        System.out.println("======= SISTEMA DE CASA INTELIGENTE =======");
        System.out.println("\n----- LIGANDO TODOS OS DISPOSITIVOS -----\n");
        for (Dispositivo dispositivo : dispositivos) {
            dispositivo.exibirStatus();
            dispositivo.ligar();
        }

        System.out.println("\n----- COLOCANDO TODOS PARA FUNCIONAR -----\n");
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo instanceof Monitoravel) {
                ((Monitoravel) dispositivo).gerarRelatorio();
            } else {
                dispositivo.exibirStatus();
            }
            System.out.println("--------------------------------------------------");
        }

        System.out.println("\n----- MOSTRANDO TODOS OS DISPOSITIVOS -----\n");
        for (Dispositivo dispositivo : dispositivos) {
            dispositivo.exibirStatus();
        }

    }
}