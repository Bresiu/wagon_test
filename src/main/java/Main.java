import org.joda.time.DateTime;

/**
 * @author Michal Brewczak
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(new DateTime().toString() + " test 2");
		Dependience dependience = new Dependience();
		dependience.test();
	}
}
