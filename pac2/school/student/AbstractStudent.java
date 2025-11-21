package pac2.school.student;

public abstract class AbstractStudent{
    private String name;

    public AbstractStudent(String name){
        this.name=name;
    }

    public abstract void testScore();
    public void sleep(){
        System.out.println("肘をついて隠すように寝ます");
    }
    public String getName(){
        return name;
    }
}