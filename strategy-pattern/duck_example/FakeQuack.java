package duck_example;
public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}