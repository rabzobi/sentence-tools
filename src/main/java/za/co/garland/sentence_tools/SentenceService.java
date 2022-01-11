package za.co.garland.sentence_tools;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Quick little class to make a soap webservice
 * 
 * @author Robert
 *
 */
@WebService
public class SentenceService {

	/**
	 * <pre> 	 
	 * Validate a sentence with the following rules:
	 * 
	 * 1. String starts with a capital letter. 
	 * 2. String has an even number of quotation marks. 
	 * 3. String ends with one of the following sentence termination characters: . ! ? 
	 * 4. String has no period characters other than the last character. 
	 * 5. Numbers below 13 are spelled out (”one”, “two”,"three”...
	 * </pre>
	 * 
	 * @param sentence: the string to validate
	 * @return true if sentence is valid
	 */
	@WebMethod
	public boolean checkValidity(@WebParam(name = "sentence") String sentence) {
		return Sentence.checkValidity(sentence);
	}
}