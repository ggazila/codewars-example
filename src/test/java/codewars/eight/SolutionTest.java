package codewars.eight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SolutionTest {

    @Test
    void testSomething() {
        assertTrue(DidSheSayHello.validateHello("hello"));
        assertTrue(DidSheSayHello.validateHello("ciao bella!"));
        assertTrue(DidSheSayHello.validateHello("salut"));
        assertTrue(DidSheSayHello.validateHello("hallo, salut"));
        assertTrue(DidSheSayHello.validateHello("hombre! Hola!"));
        assertTrue(DidSheSayHello.validateHello("Hallo, wie geht\'s dir?"));
        assertTrue(DidSheSayHello.validateHello("AHOJ!"));
        assertTrue(DidSheSayHello.validateHello("czesc"));
        assertTrue(DidSheSayHello.validateHello("Ahoj"));
        assertFalse(DidSheSayHello.validateHello("meh"));
    }
}
