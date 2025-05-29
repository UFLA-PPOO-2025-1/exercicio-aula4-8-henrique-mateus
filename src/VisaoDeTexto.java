import java.awt.Color;

public class VisaoDeTexto implements VisaoSimulador {

    private EstatisticasCampo estatisticas;

    public VisaoDeTexto() {
        estatisticas = new EstatisticasCampo();
    }

    @Override
    public void definirCor(Class<?> classeAnimal, Color cor) {
        // Não faz sentido definir cor em uma visão de texto
    }

    @Override
    public boolean ehViavel(Campo campo) {
        return estatisticas.ehViavel(campo);
    }

    @Override
    public void mostrarStatus(int passo, Campo campo) {
        estatisticas.reiniciar();
        System.out.println("Passo: " + passo + " - " + estatisticas.obterDetalhesPopulacao(campo));
    }

    @Override
    public void reiniciar() {
        estatisticas.reiniciar();
    }

    @Override
    public void reabilitarOpcoes() {
        // Não faz sentido
    }
}