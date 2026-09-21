public class Person {
    int age;
    String name;
    Person(int a, String na)
    {
    this.age = a;
    this.name = na;
    }
    public void ShowInfo()
    {
        System.out.println("AGE :"+ age);
        System.out.println("NAME :"+ name);
    }
}
