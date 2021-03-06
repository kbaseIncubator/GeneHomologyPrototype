package us.kbase.genehomology.core.exceptions;

/** Thrown when a required parameter was not provided.
 * @author gaprice@lbl.gov
 *
 */
@SuppressWarnings("serial")
public class MissingParameterException extends GeneHomologyException {

	//TODO TEST
	
	public MissingParameterException(final String message) {
		super(ErrorType.MISSING_PARAMETER, message);
	}
}
