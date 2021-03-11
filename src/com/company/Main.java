package com.company;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    private static Object LocalDate;

    static class Person{
        String name;

        Person(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
	// Uncomment the functions you want to run
        //dataTypes();
        //referenceTypes();
        //Primitive_Reference();
        //String_Class();
        Arithmetic_Operations();

    }

    private static void referenceTypes(){
        /*Reference always start with uppercase*/

        String name = new String("Emmanuel");
        System.out.println(name.toUpperCase());
        //LocalDate now = LocalDate.now();
        //System.out.println(now.getMonth());
    }

    private static void Primitive_dataTypes(){
        int number = 100; //integer numbers
        String name = "Emmanuel"; //strings
        double number2 = 100.01; //decimal numbers
        //Date date = new Date(); //date variable
        byte theByte = -128; //stores wholes numbers from -128 to 127
        short theShort = 8989; //stores whole from -32768 to 32767
        long theLong = 78783833342L; //stores whole from
        float pi = 3.14F;
        boolean isHuman = true;
        char nameInitial = 'E';

        System.out.println(number);
        System.out.println(name);
        System.out.println(number2);
        //System.out.println(date);
        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theLong);
        System.out.println(pi);
        System.out.println(isHuman);
        System.out.println(nameInitial);
    }

    private static void Primitive_Reference()
    {
        //Difference between primitive and and reference type
        int a = 10;
        int b = a;

        Person emmanuel = new Person("Emmanuel");
        Person miriam = emmanuel;

        a = 100;

        System.out.println("a = " + a + " - b = " + b);

        System.out.println("Before changing emmanuel:");
        System.out.println(emmanuel.name + " " + miriam.name);

        emmanuel.name = "Emma";

        /*Output will be Alex Alex
        * To change actually the name of Miriam we use miriam.name = "name"*/
        System.out.println("After changing emmanuel:");
        System.out.println(emmanuel.name + " " + miriam.name);
    }

    private static void String_Class(){
        //String class
        char a = 'A';
        char b = 'B';

        //name variable is an object
        String name = new String("Emmanuel");
        String word = new String("Emma");

        //new String() can be dropped completed
        String lastName = "Corpus";

        //.toUppercase() and other are methods of the object
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0)); //First character of the string

        //Check if string contains a substring within it
        System.out.println(name.contains(word));//return true

        //Compare if two strings are equal
        System.out.println(name.equals(lastName)); //returns false
    }

    private static void Packages_and_Import_Keywords(){
        /*Requires
        * import java.time.LocalDate;
          import java.util.Date;
          * at the begining of the file

          * Also requires the following line at the beginning of the method
          * private static Object LocalDate;*/

        java.util.Date date = new java.util.Date(); //Another way of writing it
        //LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
    }

    private static void Arithmetic_Operations(){
        int ten = 10;
        int two = 2;
        int addition = ten + two;

        System.out.println(addition);
        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println(10 * 2);
        System.out.println(10 / 2);
        System.out.println(10 % 2);
        System.out.println((10 * 2) + 7);
        System.out.println(10 * (2 + 7));
    }
}
