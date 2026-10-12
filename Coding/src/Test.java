public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("张三", "123456", 90);
        Student student3 = new Student();
        student1.setName("李四");
        student1.setStudentId("789012");
        student1.setScore(85);
        student3.setName("王五");
        student3.setStudentId("345678");
        student3.setScore(78);
        student1.introduce();
        student2.introduce();
        student3.introduce();

        GraduateStudent graduateStudent1 = new GraduateStudent("Alice", "111111", 95, "Professor Smith");
        graduateStudent1.introduce();
        Student graduateStudent2 = new GraduateStudent("Bob", "222222", 88, "Professor Johnson");
        graduateStudent2.introduce();
//        graduateStudent2.research();
    }
}
