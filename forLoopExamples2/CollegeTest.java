package com.training.forLoopExamples;

import com.training.dto.MaleOrFemaleCountDto;
import com.training.model.Student;

import java.util.List;

public class CollegeTest {

    public static void main(String... args) {
        StudentInfo studentInfo = new StudentInfo();

        // Build cse information
        List<Student> cseGroup = studentInfo.buildCseStudentInfo();
        System.out.println("Cse group info -------------> ");
        studentInfo.checkFemaleOrMale(cseGroup);


        // Build Ece information
        System.out.println("\n Ece group info -------------> ");
        List<Student> eceGroup = studentInfo.buildEceStudentInfo();
        MaleOrFemaleCountDto maleOrFemaleCountDto = studentInfo.checkFemaleOrMale(eceGroup);
        System.out.print("\n   male count: " + maleOrFemaleCountDto.getMaleCount());
        System.out.print("\n   female count: " + maleOrFemaleCountDto.getFemaleCount());

    }
}
