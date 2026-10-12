public class GraduateStudent extends Student{
    private String advisor;
    public GraduateStudent(){
        super();
    }
    public GraduateStudent(String name, String studentId, int score, String advisor){
        super(name, studentId, score);
        this.advisor = advisor;
    }

    @Override
    public void introduce(){
        System.out.println("我是" + getName() + "，学号" + getStudentId() + "，成绩" + getScore() + "，导师" + advisor);
    }

    public void research()
    {
        System.out.println("我在做科研");
    }
}
