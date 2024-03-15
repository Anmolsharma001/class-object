class Student
{
    public static class students
    {
        int rollNo;
        double percent;
        String name;
    }
    public static void main(String[]args)
    {
        students s1=new students();
        s1.name="anmol";
        s1.rollNo=56;
        s1.percent=67.7;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.percent);
    }
}