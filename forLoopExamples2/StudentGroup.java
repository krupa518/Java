package com.training.forLoopExamples;

import com.training.model.Student;

import java.util.List;

public class StudentGroup {
    public  static  void main(String... args){
        StudentInfo studentInfo = new StudentInfo();
        List<Student> studentList = studentInfo.buildStudentInfo();
        int cseMaleCount =0;
        int cseFemaleCount=0;
        int eceMaleCount =0;
        int eceFemaleCount =0;
        int eeeMaleCount =0;
        int eeeFemaleCount =0;

        for(int i=0; i<studentList.size(); i++){
            if(studentList.get(i).isMale()){
                if(studentList.get(i).getGroupName().equalsIgnoreCase("cse")){
                    cseMaleCount =  cseMaleCount + 1;
                }
                else if(studentList.get(i).getGroupName().equalsIgnoreCase("ece")){
                    eceMaleCount = eceMaleCount + 1;
                }else{
                    eeeMaleCount = eeeMaleCount + 1;
                }


            }
            else{
                if(studentList.get(i).getGroupName().equalsIgnoreCase("cse")){
                    cseFemaleCount = cseFemaleCount + 1;
                }else if(studentList.get(i).getGroupName().equalsIgnoreCase("ece")){
                    eceFemaleCount = eceFemaleCount + 1;
                }
                else {
                    eeeFemaleCount = eeeFemaleCount + 1;
                }

            }

        }
        System.out.println("male count is :"+cseMaleCount);
        System.out.println("male count is :"+cseFemaleCount);
        System.out.println("male count is :"+eceMaleCount);
        System.out.println("male count is :"+eceFemaleCount);
        System.out.println("male count is :"+eeeMaleCount);
        System.out.println("male count is :"+eeeFemaleCount);


    }
}
