package telran.strings.test;
import static telran.strings.Strings.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void javaVariableTrueTest() {
		String regex=javaVariable();
		assertTrue("a".matches(regex));
		assertTrue("$".matches(regex));
		assertTrue("a123".matches(regex));
		assertTrue("__".matches(regex));
		assertTrue("_$".matches(regex));
		assertTrue("$_".matches(regex));
		assertTrue("aA".matches(regex));
		assertTrue("Aa".matches(regex));
		


		


		

		

	}
	@Test
	void javaVariableFalseTest() {
		String regex=javaVariable();
		assertFalse("1a".matches(regex));
		assertFalse("123".matches(regex));
		assertFalse("a&c".matches(regex));
		assertFalse("a C".matches(regex));
		assertFalse("_".matches(regex));


		


	}
	@Test
	void zero_300_true_test() {
		String regex=zero_300();
		assertTrue("0".matches(regex));
		assertTrue("10".matches(regex));
		assertTrue("9".matches(regex));
		assertTrue("100".matches(regex));
		assertTrue("199".matches(regex));
		assertTrue("299".matches(regex));
		assertTrue("300".matches(regex));

		





		
	}
	@Test
	void zero_300_false_test() {
		String regex=zero_300();
		assertFalse("01".matches(regex));
		assertFalse("1 0".matches(regex));
		assertFalse("1_0".matches(regex));
		assertFalse("301".matches(regex));
		assertFalse("1000".matches(regex));
		assertFalse("1_0".matches(regex));
		assertFalse("2.5".matches(regex));
		assertFalse("-1".matches(regex));
		assertFalse("a".matches(regex));
	}
	@Test
	void ipv40ctetTrueTest() {
		String regex=zero_300();
		assertTrue("0".matches(regex));
		assertTrue("00".matches(regex));
		assertTrue("000".matches(regex));
		assertTrue("01".matches(regex));
		assertTrue("1".matches(regex));
		assertTrue("199".matches(regex));
		assertTrue("220".matches(regex));
		assertTrue("249".matches(regex));
		assertTrue("255".matches(regex));
	}
	@Test
	void ipv40ctetFalseTest() {
		String regex=zero_300();
		assertFalse("-21".matches(regex));
		assertFalse("a".matches(regex));
		assertFalse("1 0".matches(regex));
		assertFalse("0000".matches(regex));
		assertFalse("256".matches(regex));
		assertFalse("1000".matches(regex));
		assertFalse("300".matches(regex));
	}
	@Test
	void ipv4AdressTrueTest() {
		String regex=zero_300();
		assertFalse("-21".matches(regex));
		assertTrue("a".matches(regex));
		assertTrue("1 0".matches(regex));
		assertTrue("0000".matches(regex));
		assertTrue("256".matches(regex));
		assertTrue("1000".matches(regex));
		assertTrue("300".matches(regex));
	}
	@Test
	void
	arithmeticExpressionTrueTest() {
	String regex= arithmeticExpression();
	assertTrue("1.5 + a/2*10-21".matches(regex));
	assertTrue(" .5 + $/2* 10.0 /21.1234".matches(regex));
	assertTrue("5. + __/2* 0.0 /0 ".matches(regex));
	assertTrue("25.".matches(regex));
	assertTrue(" aA123 ".matches(regex));
	}
	@Test
	void arithmeticExpressionFalseTest() {
	String regex= arithmeticExpression();
	assertFalse("1.5 # a/2*10-21".matches(regex));
	assertFalse(".5 + $ 1/2* 10.0 /21.1234".matches(regex));
	assertFalse("25 .".matches(regex));
	assertFalse("aA123*".matches(regex));
    assertFalse(" + a * b".matches(regex));
	

}
}
