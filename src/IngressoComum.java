class IngressoComum extends Ingresso {

    private static final float VALOR_INTEIRO_COMUM = 24;
    private static final float VALOR_MEIA_COMUM = 12;

    public IngressoComum(Filme filme, String tipoIngresso, String horarioSessao) {
        super(filme, tipoIngresso, horarioSessao);
    }

    @Override
    public float getValorInteira() {
        return VALOR_INTEIRO_COMUM;
    }

    @Override
    public float getValorMeia() {
        return VALOR_MEIA_COMUM;
    }
}