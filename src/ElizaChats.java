/*
Welcome to ElizaChats! My name is Eliza, What's your name?
Hannah Snow
Nice to meet you, Hannah Snow, How has your day been?
It has been a splendid day!
Okay, Anything in particular that makes you feel that It has been a splendid day! ?
Yes, I got a job promotion :)
Okay, Well it has been my pleasure to speak with you. Have a nice day!

Here are your responses: Hannah Snow It has been a splendid day! Yes, I got a job promotion :)
 */

import java.util.Scanner;

public class ElizaChats {
    public static void main (String[] args) {
        String name, chat1, allChat="";
        Scanner keybd = new Scanner(System.in);
        System.out.println ("Welcome to ElizaChats! My name is Eliza, What's your name?");
        name =keybd.nextLine();
        allChat += name;
        System.out.printf ("Nice to meet you, %s, How has your day been?", name);
        chat1 =keybd.nextLine();
        allChat +=chat1 + " ";
        System.out.println ("Okay, Anything in particular that makes you feel that It has been a splendid day! ?");
        chat1 =keybd.nextLine();
        allChat +=chat1;

        System.out.println ("Okay, Well it has been my pleasure to speak with you. Have a nice day!");

        System.out.printf("Here are your responses: %s", allChat);
    }

}
