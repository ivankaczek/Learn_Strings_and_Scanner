/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn_strings_app;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Learn_Strings_APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String input01 = "1 drc 2 drc 3 drc 5 drc romanee conti drc vosne romanee drc rouge drc";
        Scanner sc01 = new Scanner(input01).useDelimiter("\\s*drc\\s*");
        System.out.println(sc01.nextInt());
        
        System.out.println(sc01.nextInt());
        System.out.println(sc01.nextInt());
        System.out.println(sc01.nextInt());
        System.out.println(sc01.next());
        System.out.println(sc01.next());
        System.out.println(sc01.next());
        
        /*
        The previous will show the following output
        
        run:
1
2
3
5
romanee conti
vosne romanee
rouge
BUILD SUCCESSFUL (total time: 0 seconds)
        
        */
        
    }
    
}

/*
The following is extracted from Oracle Docs: https://docs.oracle.com/javase/7/docs/api/

A simple text scanner which can parse primitive types and strings using regular expressions.
                                                                        REGULAR EXPRESSIONS :) I want to learn this soon

A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. 
The resulting tokens may then be converted into values of different types using the various next methods.

   String input = "1 fish 2 fish red fish blue fish";
     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
     System.out.println(s.nextInt());
     System.out.println(s.nextInt());
     System.out.println(s.next());
     System.out.println(s.next());
     s.close(); 
prints the following output:

     1
     2
     red
     blue 

When a scanner throws an InputMismatchException, the scanner will not pass the token that caused the exception, so that it may be retrieved or skipped via some other method.

Depending upon the type of delimiting pattern, empty tokens may be returned. For example, the pattern "\\s+" will return no empty tokens since it matches multiple instances of the delimiter. The delimiting pattern "\\s" could return empty tokens since it only passes one space at a time.

A scanner can read text from any object which implements the Readable interface. 
If an invocation of the underlying readable's Readable.read(java.nio.CharBuffer) method throws an IOException then the scanner 
assumes that the end of the input has been reached. 
The most recent IOException thrown by the underlying readable can be retrieved via the ioException() method.

Unless otherwise mentioned, passing a null parameter into any method of a Scanner will cause a NullPointerException to be thrown.

*/