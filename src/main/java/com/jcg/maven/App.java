package com.jcg.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


    public void notCovered() {
        System.out.println("notCovered");
    }



    public class Car{

        public DriveTrain drive;

        public void tearDown(){
            System.out.println("Tear Down");
        }

        public void drive() {System.out.println("Drive");}  // Noncompliant; duplicates field name
    }




}
