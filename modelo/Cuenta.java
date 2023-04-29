package modelo;

public class Cuenta
{
    //----------
    //Atributos
    //----------
    private String pass;
    private String user;
    private String pag;

    //----------
    //Métodos
    //----------

    public Cuenta(String pUser, String pPass)
    {
        this.user = pUser;
        this.pass = pPass;
    }

    public String getUser()
    {
        return user;
    }

    public String getPass()
    {
        return pass;
    }

}