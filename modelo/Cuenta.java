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

    public Cuenta()
    {
        this.user = "";
        this.pass = "";
        this.pag = "";
    }

    public Cuenta(String pUser, String pPass, String pPag)
    {
        this.user = pUser;
        this.pass = pPass;
        this.pag = pPag;
    }

    public String getPag()
    {
        return pag;
    }

    public void setPag(String pPag)
    {
        this.pag = pPag;
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