package com.training.ifstatement;

import java.util.ArrayList;
import java.util.List;

public class StudentValidation {
    public void checkMaleorFemale(List<Student> cse){

        int femalecount = 0;
        int malecount = 0;
        for (int i = 0; i < cse.size(); i++) {
            if (cse.get(i).isMale()) {
                malecount = malecount + 1;
            } else {
                femalecount = femalecount + 1;
            }
        }
        System.out.println("female" + femalecount);
        System.out.println("males" + malecount);

    }
    public List<Student> buildStudentInfo(){
        Student student = new Student();
        student.setId(10);
        student.setName("krupa");
        student.setNumber(1);
        student.setMale(false);
        Student student1 = new Student();
        student1.setId(11);
        student1.setName("ritu");
        student1.setNumber(2);
        student1.setMale(true);
        List<Student> cse = new ArrayList<Student>();
        cse.add(student);
        cse.add(student1);
        return cse;
    }
}
