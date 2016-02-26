package structural.proxy;

/**
 * Real subject.
 * @author che
 *
 */
public class CEO implements Leader {

	@Override
	public void sign() {
		System.out.println("CEO sign");
	}

}
