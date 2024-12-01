package org.example.sampleCheck;

public class APITest002_BuilderPattern {

    public APITest002_BuilderPattern step1(){
        System.out.println("step 1 started");
        System.out.println("step 1 done");
        return this;
    }

    public APITest002_BuilderPattern step2(){
        System.out.println("step 2 started");
        System.out.println("step 2 done");
        return this;
    }

    public APITest002_BuilderPattern step3 (String name){
        System.out.println("step 3 started");
        System.out.println("step 3 done -> : " + name);
        return this;
    }

    public static void main(String[] args) {

        APITest002_BuilderPattern ab = new APITest002_BuilderPattern();
        ab.step1().step2().step3("Abhishek");
    }
}
