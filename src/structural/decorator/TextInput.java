package structural.decorator;

/**
 * Concrete component.
 * @author che
 *
 */
public class TextInput extends Widget {

	public TextInput(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String paint() {
		return "<input type='text' name='" + this.name + "' value='" 
				+ this.value + "'>";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	protected String name;
	protected String value;
	
}
