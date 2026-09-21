public class Student extends Person {
   private String course_id;
    private int student_id;
    
    
    Student(String couid, int stuid, String name, int age)
    {
        super(age, name);
        this.course_id = couid;
        this.student_id = stuid;
    }
    @Override 
    public void ShowInfo()
    {
        System.out.println("COURSE ID :"+ course_id);
        System.out.println("STUDENT ID :"+ student_id);
    }

    public void StudentInfo()
    {
        
    }

}
