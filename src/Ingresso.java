public abstract class Ingresso {

    protected Filme filme;
    protected String tipoIngresso;
    protected String horarioSessao;

    public Ingresso(Filme filme, String tipoIngresso, String horarioSessao) {
        this.filme = filme;
        this.tipoIngresso = tipoIngresso;
        this.horarioSessao = horarioSessao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public String getHorarioSessao() {
        return horarioSessao;
    }

    public void setHorarioSessao(String horarioSessao) {
        this.horarioSessao = horarioSessao;
    }

    public abstract float getValorInteira();

    public abstract float getValorMeia();
}