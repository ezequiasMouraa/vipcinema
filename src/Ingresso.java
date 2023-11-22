public abstract class Ingresso {

    private String filme;
    private String tipoIngresso;
    private int horarioSessao;

    public Ingresso(String filme, String tipoIngresso, int horarioSessao) {
        this.filme = filme;
        this.tipoIngresso = tipoIngresso;
        this.horarioSessao = horarioSessao;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public int getHorarioSessao() {
        return horarioSessao;
    }

    public void setHorarioSessao(int horarioSessao) {
        this.horarioSessao = horarioSessao;
    }

    public abstract float getValor();
}
