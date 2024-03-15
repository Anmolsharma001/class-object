import java.util.Scanner;
class StudentClass
{
    public static class Student
    {
        String name;
        int Rno;
        double percent;
    }
    public static void func(Student x)
    {
        System.out.println(x.name);
        System.out.println(x.Rno);
        return;
    }
    public static void main(String[] args) {
     Student s1=new Student();
     s1.name="anmol";
     s1.Rno=44;
     s1.percent=45.6;
     func(s1);
    }
}
