class IngressoVIP extends Ingresso {

    private static final float VALOR_INTEIRO_VIP = 48;
    private static final float VALOR_MEIA_VIP = 24;

    public IngressoVIP(Filme filme, String tipoIngresso, String horarioSessao) {
        super(filme, tipoIngresso, horarioSessao);
    }

    @Override
    public float getValorInteira() {
        return VALOR_INTEIRO_VIP;
    }

    @Override
    public float getValorMeia() {
        return VALOR_MEIA_VIP;
    }
}