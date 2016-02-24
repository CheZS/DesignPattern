package structural.decorator;

public class Client {

	public static void main(String[] args) {
		new Client().call("abc", "abc@def.com");
	}
	
	public void call(String name, String email) {
		DecoratorLabeled textInputName = new DecoratorLabeled("Name", new TextInput("name", name));
		DecoratorLabeled textInputEmail = new DecoratorLabeled("Email", new TextInput("email", email));
		System.out.println(textInputName.paint());
		System.out.println(textInputEmail.paint());
	}
}
