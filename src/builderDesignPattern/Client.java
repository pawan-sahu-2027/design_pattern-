package builderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setAge(23);
        builder.setName("John");
        builder.setGradeYear(2020);
        builder.setPsp(90);
        builder.setUniversityName("University of Toronto");
        Student student = new Student(builder);
        System.out.println();
    }
}
