public class String2 {
    public static void main(String [] args){
        String greeting = "Hello";
        System.out.println(greeting);

        // finding the length of the string
        String txt = "ABCDRFGHJIKLMNOPQRSTUVWXYZ";
        System.out.println("the length of the string is: " + txt.length());

        // finding the character at a specific index
        String txt1 = "Hello World";
        System.out.println("the character at index 0 is: " + txt1.charAt(0));

        //convert to Uppercase and lowercase 
        System.out.println("Uppercase : " + txt1.toUpperCase());
        System.out.println("Lowercase : " + txt1.toLowerCase());

        //index()
        String txt2 = "please locate where 'locate' occurs !";
        System.out.println(txt2.indexOf("locate"));
        String txt3 = "please locate where \"locate\" occurs !";
        System.out.println(txt3.indexOf("locate"));
        System.out.println(txt2.indexOf("locate", 8));

        //comapring strings
        String txt4 = "Hello";
        String txt5 = "Hello";
        String txt6 = "Greetings";
        String txt7 = "Greetings hello";
        System.out.println(txt4.equals(txt5));
        System.out.println(txt6.equals(txt7));

        //Remove whitespace from the beginning and the end of a string
        String txt8 = "                 Hello World, Riddhima                       ";
        System.out.println(txt8);
        System.out.println(txt8.trim());
        
        //concatenate Strings
        String txt9 = "Hello";
        String txt10 = "World";
        System.out.println(txt9.concat(txt10));
        System.out.println(txt9 + txt10);




        

    }
    
}
