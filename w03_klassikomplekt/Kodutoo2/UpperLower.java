package Kodutoo2;

import java.util.Random;

public class UpperLower{
    public static void main(String[] args){
        String string = "This is randmon";
        String upper = string.toUpperCase();
        String lower = string.toLowerCase();
    
        System.out.println(string);
        System.out.println(lower);
        System.out.println(upper);

        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < 3; i++) {
            sb.append((char)('A' + random.nextInt(26)));
        }
        // and 3 random digits
        for(int i = 0; i < 3; i++) {
            sb.append(random.nextInt(10));
        }
        // output the result
        System.out.println(sb);
        // make this whole string lower case and output the result
        String lowerCase = sb.toString().toLowerCase();
        System.out.println(lowerCase);
        // make only the first character upper case and output the result
        System.out.println(lowerCase.substring(0, 1).toUpperCase() + lowerCase.substring(1));

        String myString = "HelloWorld";
        
        //2
        Random randomNumber = new Random();

        //3
        for (int i = 0; i < 10; i++) {
           //4
            int randomNo = randomNumber.nextInt(myString.length());
            
            //5
            Character character = myString.charAt(randomNo);

            //6
            System.out.println("Random Character : " + Character.toUpperCase(character));

            String s = "1a23test12hjsd2"; // Take it as a password
            char[] c= s.toCharArray(); //Convert string in chararray
            boolean flag= false;
            StringBuilder s1= new StringBuilder();
            for(int d:c){
                if(d>=97 && d<=122 && !flag){ //Converting lowercase to upper case
                    d=d-32;
                    flag=true;
                }
                s1.append((char)d);
            }
            System.out.println(s1);

        }
    }
}