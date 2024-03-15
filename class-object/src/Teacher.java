//POLYMORPHISM ...........
public class Teacher
{
    String name;
    int age;
    public void printInfo(String name)
    {
        System.out.println(name);
    }
    public void printInfo(int age)
    {
        System.out.println(age);
    }
    public void printInfo(String name,int age)
    {
        System.out.println(name+" "+age);
    }
}
class Teacher2
{
    public static void main(String[] args)
    {
       Teacher t1=new Teacher();
       t1.name="rani";
       t1.age=22;
       t1.printInfo(t1.name);//t1.age,t1.name+" "+t1.age aa jayenga to name,age
                             //print hongaa...
    }
}
