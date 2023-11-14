package pacote;

class Sessao {
    private boolean statusSessao;
    private String horario;

    public Sessao(boolean statusSessao, String horario) {
        this.statusSessao = statusSessao;
        this.horario = horario;
    }

    // Método para obter o horário da sessão
    public String getHorario() {
        return horario;
    }

    // Método para iniciar uma sessão
    public void iniciarSessao() {
        this.statusSessao = true; // Define o status da sessão como iniciada
    }

    // Método para encerrar uma sessão
    public void encerrarSessao() {
        this.statusSessao = false; // Define o status da sessão como encerrada
    }
}
