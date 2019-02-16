package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

	@Test
	public void greeterSaysHello() {
        final String content = "Hello";
        final long id = 123;
        Greeting greeting = new Greeting(id, content);
		assertThat(greeting.getContent(), containsString(content));
	}

}