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
        //TODO todo
        //TODO hey
    }

    public void newMethodGitchecks(){
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant; target = -3. Is that really what's meant?
        target =+ num; // Noncompliant; target = 3


        String str = "/File|Name.txt";

        String clean = str.replaceAll(".",""); // Noncompliant; probably meant to remove only dot chars, but returns an empty string
        String clean2 = str.replaceAll("|","_"); // Noncompliant; yields _/_F_i_l_e_|_N_a_m_e_._t_x_t_


    }

    class A {
        void foo(boolean a, Object b) throws MyException {
            Object o = bar(a, b);
            if (a) {
                o.toString(); // HERE
            }
        }
        private Object bar(boolean b, Object o) throws MyException {
            if (b) {
                return null;
            }
            if (o == null)  {
                throw new MyException();
            }
            return o;
        }
    }
    class MyException extends Exception { }
}
