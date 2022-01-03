package com.training.forLoopExamples;

import com.training.dto.MaleOrFemaleCountDto;
import com.training.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherInfo {


    public static void main(String...args) {
       TeacherTest teacherTest = new TeacherTest();
        List<Teacher> cseGroup= teacherTest.buildCseGroup();
        System.out.println("Cse groupTeachers....paid");
        teacherTest.checkPaidOrNot(cseGroup);


        System.out.println("Ece group Teachers paid.....");
        List<Teacher> eceGroup = teacherTest.buildEseGroup();

        MaleOrFemaleCountDto maleOrFemaleCountDto = teacherTest.checkPaidOrNot(eceGroup);
        System.out.println("male count teachers paid :"+maleOrFemaleCountDto.getMaleCount());
        System.out.println("female count teachers paid:"+maleOrFemaleCountDto.getFemaleCount());


        }

    }

