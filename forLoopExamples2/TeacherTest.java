package com.training.forLoopExamples;

import com.training.dto.MaleOrFemaleCountDto;
import com.training.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherTest {
    public  List<Teacher>  buildCseGroup(){
        Teacher teacher = new Teacher();
        teacher.setName("krupa");
        teacher.setNumber(1);
        teacher.setAge(1);
        teacher.setIspaid(true);
        Teacher teacher1 = new Teacher();
        teacher1.setName("raj");
        teacher1.setNumber(1);
        teacher1.setAge(1);
        teacher1.setIspaid(true);

        List<Teacher> cseGroup =  new ArrayList<Teacher>();
        cseGroup.add(teacher);
        cseGroup.add(teacher1);
        return cseGroup;
    }
    public  List<Teacher>  buildStudent(){
        Teacher teacher = new Teacher();
        teacher.setName("krupa");
        teacher.setNumber(1);
        teacher.setAge(1);
        teacher.setIspaid(true);
        teacher.setGroupname(true);
        Teacher teacher1 = new Teacher();
        teacher1.setName("raj");
        teacher1.setNumber(1);
        teacher1.setAge(1);
        teacher1.setIspaid(true);
        teacher1.setGroupname(false);

        List<Teacher> cseGroup =  new ArrayList<Teacher>();
        cseGroup.add(teacher);
        cseGroup.add(teacher1);
        return cseGroup;
    }

    public  List<Teacher>  buildEseGroup(){
        Teacher teacher = new Teacher();
        teacher.setName("kru");
        teacher.setNumber(1);
        teacher.setAge(1);
        teacher.setIspaid(true);
        Teacher teacher1 = new Teacher();
        teacher1.setName("raja");
        teacher1.setNumber(1);
        teacher1.setAge(1);
        teacher1.setIspaid(true);

        List<Teacher> eceGroup =  new ArrayList<Teacher>();
        eceGroup.add(teacher);
        eceGroup.add(teacher1);
        return eceGroup;
    }
    public MaleOrFemaleCountDto checkPaidOrNot(List<Teacher> list){
        int femaleCount  = 0;
        int maleCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isIspaid()) {
                femaleCount = femaleCount + 1;
            } else {
                maleCount = maleCount + 1;
            }
        }
        MaleOrFemaleCountDto maleOrFemaleCountDto = new MaleOrFemaleCountDto();
        maleOrFemaleCountDto.setMaleCount(maleCount);
        maleOrFemaleCountDto.setFemaleCount(femaleCount);
        return maleOrFemaleCountDto;
    }


}
