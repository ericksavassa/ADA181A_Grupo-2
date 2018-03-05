import Access.AccessClass;
import Contatos.ContatoEmail;
import Contatos.ContatoIntF;
import Contatos.ContatoSMS;
import Contatos.ContatoTelefone;
import Sistemas.CarregamentoClass;
import Util.EmpresaClass;
import Util.ParametroClass;

public class Main {

    public static void main(String[] args) {

        /*

            ./gradlew build
            ./gradlew run

        */

        //SINGLETON

        //PARAMETROS
        ParametroClass parametro = ParametroClass.getInstancia();
        parametro.ConfiguracaoTeste = "Config Teste";

        System.out.println(parametro.ConfiguracaoTeste);

        //EMPRESA
        EmpresaClass empresa = EmpresaClass.getInstancia();
        empresa.RazaoSocial = "Razao Social";
        empresa.CNPJ = "CNPJ";

        System.out.println(empresa.RazaoSocial);
        System.out.println(empresa.CNPJ);

        //FACTORY

        //CONTATOS
        ContatoIntF contatoEmail = new ContatoEmail();
        System.out.println(contatoEmail.IniciarContato());

        ContatoIntF contatoSMS = new ContatoSMS();
        System.out.println(contatoSMS.IniciarContato());

        ContatoIntF contatoTelefone = new ContatoTelefone();
        System.out.println(contatoTelefone.IniciarContato());

        //LOGIN
        AccessClass accessClass = new AccessClass();
        if (accessClass.login()) {

            //PERFIL
            String perfil = accessClass.perfil();

            //FACADE

            //CARREGAMENTO DE SISTEMAS
            CarregamentoClass carregamentoSistemas = new CarregamentoClass();
            carregamentoSistemas.CarregarSistemas(perfil);

        }

    }

}
