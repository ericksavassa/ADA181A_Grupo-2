package Util;

/**
 * Created by esavassa on 05/03/2018.
 */
public class EmpresaClass {

    public static EmpresaClass instancia;

    private EmpresaClass(){

    }

    public String RazaoSocial;

    public String CNPJ;

    public static EmpresaClass getInstancia() {

        if(instancia == null)
            instancia = new EmpresaClass();

        return instancia;

    }

}
