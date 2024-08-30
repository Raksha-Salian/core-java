package com.xworkz.college;

import com.xworkz.college.college.CollegeDetails;
import com.xworkz.college.college.NitteClg;

public class CollegeRunner {
    public static void main(String[] args) {

        CollegeDetails.cityName="Bangalore";
        NitteClg nmit = new NitteClg();
        nmit.clgId = 1234;
        nmit.location= "yelahanka";

        System.out.println(nmit);

    }
}
