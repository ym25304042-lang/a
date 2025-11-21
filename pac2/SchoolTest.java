package pac2;

import pac2.school.TamaSchool;
import pac2.school.student.*;

public class SchoolTest{
    public static void main(String[]args){
        TamaSchool school=new TamaSchool();

        school.addStudent(new Tanaka("鈴木一郎"));

        school.meal();
    }
}