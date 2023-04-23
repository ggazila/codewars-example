package codewars.eight;

import java.util.List;

/*
https://www.codewars.com/kata/56a4addbfd4a55694100001f/train/java
 */
public class DidSheSayHello {
    public static boolean validateHello(String greetings) {
        List<String> greetingsList = List.of("hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc");

        return greetingsList.stream().anyMatch(greet -> greetings.toLowerCase().contains(greet));
    }

}
