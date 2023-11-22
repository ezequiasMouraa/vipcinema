public class IngressoComum extends Ingresso {

    public IngressoComum(String filme, String tipoIngresso, int horarioSessao) {
        super(filme, tipoIngresso, horarioSessao);
    }

    @Override
    public float getValor() {
        if (getTipoIngresso().equals("inteiro")) {
            return 24;
        } else {
            return 12;
        }
    }
}
