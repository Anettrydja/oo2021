public class First{
    public static void main(String[] args){
        //System.out.println(args.length);
        int[] numberArray = new int[5];
        int numberArray2[] = new int[5];

        String[] stringArray = new String[5];
        String[] greetingsArray = new String[]{ "Hello", "World", "!"}; //algväärtustamisega


        String name = "Anett";

        // primitiivtüübid
        int year = 2021;
        byte bait = Byte.MAX_VALUE; // -128 to 127
        short myShort = Short.MAX_VALUE;
        long myLong = Long.MAX_VALUE;
        int myInt = Integer.MAX_VALUE; 
        double doubleNumber = 3.4;
        float floatNumber = 3.4f;
        boolean flag = true; //false
        char character = 'F';

        //fori tsükkel
        for (int i = 0; i < greetingsArray.length; i++){
            System.out.println(greetingsArray[i]);
        }

        //foreach tsükkel
        for (String text : greetingsArray){ 
            System.out.println(text);
        }

        //while tsükkel
        int length = greetingsArray.length; //args.length
        while (length > 0){
            length--;
            System.out.println("Inside while");
        }

        if (year == 2021){
            System.out.println(year + " is equal to 2021"); 
        } else if (year > 2021){
            System.out.println(year + " is larger than 2021");
        } else {
            System.out.println(year + " is not equal or larger to 2021");
        }

        System.out.println("Hello world");
        System.out.println("Test one");
        System.out.println("Test two");
        System.out.print("\n");

        String hello = "Hello World!";
    }
}