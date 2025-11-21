package pac2.school.student;

public class Tanaka extends AbstractStudent{
    
    public Tanaka(String name){
        super(name);
    }

    @Override
    public void testScore(){
        System.out.println("生徒の"+getName()+"は数学のテストで12点を取りました。");
    }
}