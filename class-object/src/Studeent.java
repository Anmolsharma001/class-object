//COPY CONSTRUCTORRR
public class Studeent
{
    String name;
    int age;
    public void print()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Studeent(Studeent s2)
    {
        this.name=s2.name;
        this.age=s2.age;
    }
    Studeent()
    {

    }
}
class Studu
{
    public static void main(String[] args)
    {
        Studeent s1=new Studeent();
        s1.name="rahul";
        s1.age=33;
        Studeent s2=new Studeent(s1);
        s2.print();
    }
}