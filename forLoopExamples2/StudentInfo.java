package com.training.forLoopExamples;

import com.training.dto.MaleOrFemaleCountDto;
import com.training.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {

    public List<Student> buildCseStudentInfo() {
        Student student = new Student();
        student.setId(11);
        student.setName("krupa");
        student.setNumber(1);
        student.setMale(true);

        Student student1 = new Student();
        student1.setName("ritu");
        student1.setNumber(2);
        student1.setId(12);
        student1.setMale(false);

        Student student2 = new Student();
        student2.setId(13);
        student2.setName("sanvi");
        student2.setNumber(3);
        student2.setMale(true);

        List<Student> cseGroup = new ArrayList<Student>();
        cseGroup.add(student);
        cseGroup.add(student1);
        cseGroup.add(student2);

        return cseGroup;
    }

    public List<Student> buildEceStudentInfo() {
        Student student = new Student();
        student.setId(11);
        student.setName("krupa");
        student.setNumber(1);
        student.setMale(true);

        Student student1 = new Student();
        student1.setName("ritu");
        student1.setNumber(2);
        student1.setId(12);
        student1.setMale(false);

        Student student2 = new Student();
        student2.setId(13);
        student2.setName("sanvi");
        student2.setNumber(3);
        student2.setMale(true);

        List<Student> eceGroup = new ArrayList<Student>();
        eceGroup.add(student);
        eceGroup.add(student1);
        eceGroup.add(student2);

        return eceGroup;
    }
    public List<Student> buildStudentInfo() {
        Student student = new Student();
        student.setId(11);
        student.setName("krupa");
        student.setNumber(1);
        student.setMale(true);
        student.setGroupName("cse");

        Student student1 = new Student();
        student1.setName("ritu");
        student1.setNumber(2);
        student1.setId(12);
        student1.setMale(false);
        student1.setGroupName("ece");

        Student student2 = new Student();
        student2.setId(13);
        student2.setName("sanvi");
        student2.setNumber(3);
        student2.setMale(true);
        student2.setGroupName("ece");

        Student student3 = new Student();
        student3.setId(13);
        student3.setName("sanvi");
        student3.setNumber(3);
        student3.setMale(true);
        student3.setGroupName("eee");

        List<Student> eceGroup = new ArrayList<Student>();
        eceGroup.add(student);
        eceGroup.add(student1);
        eceGroup.add(student2);

        return eceGroup;
    }

    public MaleOrFemaleCountDto checkFemaleOrMale(List<Student> list) {
       int femaleCount  = 0;
         int maleCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isMale()) {
                femaleCount = femaleCount + 1;
            } else {
                maleCount = maleCount + 1;
            }
        }

        MaleOrFemaleCountDto maleOrFemaleCountDto = new MaleOrFemaleCountDto();
        maleOrFemaleCountDto.setFemaleCount(femaleCount);
        maleOrFemaleCountDto.setMaleCount(maleCount);

        return maleOrFemaleCountDto;
    }
}
