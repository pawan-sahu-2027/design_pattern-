package builderDesignPattern;

public class Student {

    int age;
    String name;
    int gradeYear;
    double psp;
    String universityName;

    public Student(Builder builder) {
        this.age = age;
        this.name = name;
        this.gradeYear = gradeYear;
        this.psp = psp;
        this.universityName = universityName;
        if (builder.getGradeYear()  <= 2022){
            throw new RuntimeException(" Grade year must be greater than 2022");
        }
        if (builder.getPsp() < 80){
            throw new RuntimeException("PSP must be greater than 80");
        }
        this.age = builder.getAge();
        this.name = builder.getName();
        this.gradeYear = builder.getGradeYear();
        this.psp = builder.getPsp();
        this.universityName = builder.getUniversityName();
    }
}
