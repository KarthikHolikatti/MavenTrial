import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTester {

	private HelloWorld helloworld = new HelloWorld();

	@Test
	public void HelloWorldHello() {
		assertThat(helloworld.Add(), containsString("HelloWorld"));
	}

}