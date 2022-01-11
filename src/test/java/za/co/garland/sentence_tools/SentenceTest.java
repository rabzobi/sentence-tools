package za.co.garland.sentence_tools;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit tests for Sentence class
 * 
 * @author Robert
 */
public class SentenceTest extends TestCase {

	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public SentenceTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(SentenceTest.class);
	}

	/********** Valid sentence checks... **********/
	
	public void testValidSentence1() {
		assertTrue(Sentence.checkValidity("The quick brown fox said \"hello Mr lazy dog\"."));
	}
	
	public void testValidSentence2() {
		assertTrue(Sentence.checkValidity("The quick brown fox said hello Mr lazy dog."));
	}	
	
	public void testValidSentence3() {
		assertTrue(Sentence.checkValidity("One lazy dog is too few, 13 is too many."));
	}
	
	public void testValidSentence4() {
		assertTrue(Sentence.checkValidity("One lazy dog is too few, thirteen is too many."));
	}
	
	public void testValidSentence5() {
		assertTrue(Sentence.checkValidity("How many \"lazy dogs\" are there?"));
	}		

	/********** Invalid sentence checks... **********/
	
	public void testInvalidSentence1() {		
		assertFalse(Sentence.checkValidity(""));		
	}	
	
	
	public void testInvalidSentence2() {
		assertFalse(Sentence.checkValidity("The quick brown fox said \"hello Mr. lazy dog\"."));		
	}	
	
	public void testInvalidSentence3() {
		assertFalse(Sentence.checkValidity("the quick brown fox said \"hello Mr lazy dog\"."));		
	}	
	
	public void testInvalidSentence4() {
		assertFalse(Sentence.checkValidity("\"The quick brown fox said \"hello Mr lazy dog\";"));
		
	}	
	
	public void testInvalidSentence5() {
		assertFalse(Sentence.checkValidity("One lazy dog is too few, 12 is too many."));		
	}	
	
	public void testInvalidSentence6() {
		assertFalse(Sentence.checkValidity("Are there 11, 12, or 13 lazy dogs?"));		
	}	
	public void testInvalidSentence7() {
		assertFalse(Sentence.checkValidity("There is no punctuation in this sentence"));	
	}
	
	/***** extra tests *****/
	public void testInvalidSentence8() {
		assertFalse(Sentence.checkValidity("a"));		
	}	
	
	public void testInvalidSentence9() {
		assertFalse(Sentence.checkValidity(".abc."));		
	}	
		
	public void testInvalidSentence10() {
		assertFalse(Sentence.checkValidity("Once upon a time.."));		
	}		
	
	public void testValidSentence11() {
		assertTrue(Sentence.checkValidity("Once upon a time!!"));		
	}	
	
	public void testValidSentence12() {
		assertTrue(Sentence.checkValidity("How do you do??"));		
	}	
	
	public void testInvalidSentence13() {
		assertFalse(Sentence.checkValidity(null));		
	}	
}
