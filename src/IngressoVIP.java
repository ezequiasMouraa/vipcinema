public class IngressoVIP extends Ingresso {

    public IngressoVIP(String filme, String tipoIngresso, int horarioSessao) {
        super(filme, tipoIngresso, horarioSessao);
    }

    @Override
    public float getValor() {
        if (getTipoIngresso().equals("inteiro")) {
            return 48;
        } else {
            return 24;
        }
    }

    public void acessoLanchonete() {
        System.out.println("Lanchonete do cinema liberada");
    }
}
