package prototypeDesignPattern;

public class Client {
    public static void setValues(StudentRegistery studentRegistery){
        Student july = new Student();
        july.setName("July 23 Beginner ");
        july.setAvgPsp(56.5);
        july.setInstructorName("Dheeraj");
        studentRegistery.registery("july" , july);

        InteligentStudent july24 = new InteligentStudent();
        july24.setIq(180);
        july24.setName("July 24 Beginner ");
        july24.setBatch("July 24 Beginner");
        july24.setAvgPsp(78.5);
        july24.setInstructorName(" Rama Krishna");
        studentRegistery.registery("july24" , july24);
    }

    public static void main(String[] args) {
       StudentRegistery studentRegistery = new StudentRegistery();
       setValues(studentRegistery);
        Student pawan = studentRegistery.get("july").clone();
        pawan.setName("Pawan");
        pawan.setAge(25);

    }
}
