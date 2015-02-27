package com.example;

/**
 * Created by callapatel on 2/27/15.
 */
public class MyJaxbBean {
    public String intake;
      public String anagrams;
        public MyJaxbBean() {} // JAXB needs this

    public MyJaxbBean(String intake, String anagrams) {
        this.intake = intake;
        this.anagrams = anagrams;
         }
}
