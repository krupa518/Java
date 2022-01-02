package com.training.ifstatement;

import java.util.ArrayList;
import java.util.List;

public class Class {
    public static void main(String... args) {
       StudentValidation studentValidation = new StudentValidation();
        List<Student> studentList= studentValidation.buildStudentInfo();
       studentValidation.checkMaleorFemale(studentList);
    }
}
