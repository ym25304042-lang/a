package pac2.school;

import java.util.ArrayList;
import java.util.Iterator;
import pac2.school.student.AbstractStudent;

public class TamaSchool{
    ArrayList<AbstractStudent>cage=new ArrayList<AbstractStudent>();
    public void addStudent(AbstractStudent student){
        cage.add(student);
    }

    public void meal(){
        Iterator<AbstractStudent> iterator=cage.iterator();
        while(iterator.hasNext()){
            AbstractStudent student=iterator.next();
            student.testScore();
        }
    }
}