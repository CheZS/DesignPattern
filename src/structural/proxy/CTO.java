package structural.proxy;

/**
 * Real subject.
 * @author che
 *
 */
public class CTO implements Leader {

	@Override
	public void sign() {
		System.out.println("CTO sign.");
	}

}
