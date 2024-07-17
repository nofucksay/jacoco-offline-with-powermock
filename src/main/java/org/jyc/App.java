package org.jyc;

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


    public String testMethod(String s){
        s = privateMethod() + s;
        System.out.println(s);
        return s;
    }

    private String privateMethod() {
        return "default str";
    }
}
