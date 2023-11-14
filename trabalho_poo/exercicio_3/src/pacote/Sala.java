package pacote;

import java.util.ArrayList;
import java.util.List;

class Sala {
    private int idSala;
    private int numAssentos;
    private String tipoTela;
    private String localizacao;
    private List<Sessao> sessoes; // Adicionando uma lista de sessões à sala

    public Sala(int idSala, int numAssentos, String tipoTela, String localizacao) {
        this.idSala = idSala;
        this.numAssentos = numAssentos;
        this.tipoTela = tipoTela;
        this.localizacao = localizacao;
        this.sessoes = new ArrayList<>(); // Inicializando a lista de sessões
    }

    // Método para adicionar uma sessão à sala
    public void adicionarSessao(Sessao sessao) {
        sessoes.add(sessao); // Adicionando uma sessão à lista de sessões
    }

    // Método para obter a lista de sessões da sala
    public List<Sessao> obterSessoes() {
        return sessoes; // Retorna a lista de sessões
    }

    // Método para verificar se a sala está disponível em um determinado horário
    public boolean verificarDisponibilidade(String horario) {
        for (Sessao sessao : sessoes) {
            if (sessao.getHorario().equals(horario)) {
                return false; // A sala está ocupada nesse horário
            }
        }
        return true; // A sala está disponível nesse horário
    }
}