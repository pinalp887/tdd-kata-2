package testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorJunitTesting {

	@Test
	public void test() {
		assertEquals(0.0, Operations.add(""), 0.1);
	}

	@Test
	public void shouldReturnNumberOnNumber() {
		assertEquals(1.0, Operations.add("1"), 0.1);
	}
	
	@Test
	public void shouldReturnSumOnTwoNumbersDelimitedByComma() {
		assertEquals(3.0, Operations.add("1,2"), 0.1);
	}
	
	@Test
	public void shouldReturnSumOnMultipleNumbers() {
		assertEquals(8.0, Operations.add("1,2,5"), 0.1);
	}
	
	@Test
	public void shouldAcceptNewLineAsValidDelimiter() {
		assertEquals(6.0, Operations.add("1,2\n3"), 0.1);
	}

}
