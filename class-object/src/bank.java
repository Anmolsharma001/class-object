//GETTER/SETTER USE....
class bank
{
    public String name;
    protected int age;
    private String password;

    //getter Setter
    public String getPassword()
    {
        return this.password;
    }
    public void setPassword(String pass)
    {
        this.password=pass;
    }
}
class bankData
{
    public static void main(String[] args)
    {
        bank b=new bank();
        b.name="Anmol";
        b.age=12;
        b.setPassword("abcd");
        System.out.println(b.getPassword());
    }
}