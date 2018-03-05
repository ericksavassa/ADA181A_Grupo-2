package Util;

/**
 * Created by esavassa on 05/03/2018.
 */
public class ParametroClass {

    public static  ParametroClass instancia;

    public String ConfiguracaoTeste;

    private ParametroClass(){

    }

    public static ParametroClass getInstancia() {

        if(instancia == null)
            instancia = new ParametroClass();

        return instancia;

    }

}
