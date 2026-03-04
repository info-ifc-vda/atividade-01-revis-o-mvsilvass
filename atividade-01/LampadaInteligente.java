import java.time.LocalDateTime;

import java.util.Scanner;

public class LampadaInteligente extends Dispositivo implements Conectavel, Agendavel {
    private String cor;
    private int intensidade;
    private LocalDateTime agendamento;
    private boolean conectadoWifi = false;

    Scanner scanner = new Scanner(System.in);

    public LampadaInteligente(int id, String localizacao, String cor, int intensidade) {
        super(id, localizacao);
        this.intensidade = intensidade;
        this.cor = cor;
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Intensidade: " + this.intensidade);
        System.out.println("Cor: " + this.cor);

        if(this.agendamento != null){
            System.out.println("Agendamento: " + this.intensidade);
        }else{
            System.out.println("Nenhum agendamento");
        }
    }

    @Override
    public void agendarAtividade(LocalDateTime agendamento) {
        System.out.println("Deseja marcar esse agendamento? (S ou N): ");
        String resposta = scanner.nextLine();

        if(resposta.equalsIgnoreCase("S")){  
            System.out.println("Agendando....");
            this.agendamento = agendamento;
        }
    }

    @Override
    public void cancelarAgendamento() {
        System.out.println("Esta agendado para: " + this.agendamento);
        System.out.println("Deseja desmarcar esse agendamento? (S ou N): ");
        String resposta = scanner.nextLine();

        if(resposta.equalsIgnoreCase("S")){
            System.out.println("Cancelando....");
            this.agendamento = null;
        }
    
    }

    @Override
    public void funcionar() {
       super.ligar();
    }

    @Override
    public void desligado() {
        if(super.isLigado()){
            super.desligado();
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
