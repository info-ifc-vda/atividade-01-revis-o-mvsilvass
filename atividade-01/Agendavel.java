import java.time.LocalDateTime;

public interface Agendavel {
    public void agendarAtividade(LocalDateTime agendamento);
    public void cancelarAgendamento();
}
