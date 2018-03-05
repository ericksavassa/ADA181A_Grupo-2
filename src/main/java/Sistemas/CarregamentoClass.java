package Sistemas;

public class CarregamentoClass {

    private SistemaGravacao gravacao;
    private SistemaTemporizador temporizador;
    private SistemaFilaAtendimento filaAtendimento;

    public CarregamentoClass() {

        gravacao = new SistemaGravacao();
        temporizador = new SistemaTemporizador();
        filaAtendimento = new SistemaFilaAtendimento();

    }

    public void CarregarSistemas(String perfil) {

        gravacao.CarregarSistema();
        gravacao.ChecarGravadores();
        gravacao.ChecarPortas();

        temporizador.ChecarContadores();
        temporizador.IniciarContadores();

        filaAtendimento.SelecionarAtendimentos(perfil);
        filaAtendimento.OrdenarAtendimentos();
        filaAtendimento.DisponibilizarAtendimentos();

        System.out.println("Sistemas carregados");

    }

}
