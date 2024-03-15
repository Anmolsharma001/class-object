//PARAMETER'S CONSTRUCTOR...
public class Child
{
    String name;
    int age;
    public void printData()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Child(String name,int age)//parameters constructor bana diya...
    {
        this.name=name;
        this.age=age;
    }
}
class child2
{
    public static void main(String[] args)
    {
        Child c=new Child("aman",22);
        //c.name="Anmol";
        //c.age=34;
        c.printData();
    }
}
