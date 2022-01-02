package com.training.ifstatement;

import java.util.ArrayList;
import java.util.List;

public class College1 {

    public static void main(String... args) {
        College college = new College();
        college.setId(11);
        college.setName("krupa");
        college.setNumber(1);
        college.setIsfemale(true);
        College college1 = new College();
        college1.setName("ritu");
        college1.setNumber(2);
        college1.setId(12);
        college1.setIsfemale(false);

        List<College>cse =new ArrayList<College>();
        cse.add(college);
        cse.add(college1);
        int femalecount =0;
        int malecount =0;
        for(int i=0;i< cse.size();i++){
            if(cse.get(i).setIsfemale()){
                femalecount = femalecount+1;
            }
            else{
                malecount = malecount+1;
            }
        }
        System.out.println("femalesmsg"+femalecount);
        System.out.println("malesmsg"+malecount);

        List<College>ece =new ArrayList<College>();
        ece.add(college);
        ece.add(college1);
        int femalecount1 =0;
        int malecount1 =0;
        for(int j=0;j< ece.size();j++){
            if(ece.get(j).setIsfemale()){
                femalecount1 = femalecount1+1;
            }
            else{
                malecount1 = malecount1+1;
            }
        }
        System.out.println("cseemsg"+femalecount1);
        System.out.println("ecemsg"+malecount1);
    }




}
