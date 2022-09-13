package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
   // @Test
   // public void emptyTest() {
       // assertEquals(true, true);
   // }

    @Test
    public void bracketsAroundWord(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[word]"));
    }

    @Test
    public void bracketsWithinWord(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("w[ord]"));
    }

    @Test
    public void bracketsBeforeWord(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]word"));
    }

    @Test
    public void noBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void emptyBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void nestedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[w[or]d]"));
    }

    @Test
    public void multipleWordsWithinBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("a str[ing of wor]ds"));
    }
    @Test
    public void missingClosingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word"));
    }

    @Test
    public void missingOpeningBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("word]"));
    }

    @Test
    public void closingBracketBeforeOpeningBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]word["));
    }

    @Test
    public void mismatchBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[[][][]"));
    }

    @Test
    public void moreClosingBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word]]"));
    }

}
