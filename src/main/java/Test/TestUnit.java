package Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestUnit {

@Rule
public ExpectedException exception = ExpectedException.none();
public Validation validation;

@Before
public void beforecoding() {
	validation=new Validation();
}

@Test
public void testNotBlankChaine() {
	assertTrue(validation.veriChaine("Pierre"));
}

@Test 
public void testNotBlankNumber() {
	assertTrue(validation.veriChaine(String.valueOf("232")));
}
	
@Test 
public void testmail() {
	assertTrue(validation.verifEmail("toto@gmail.com"));	
}
@Test 
public void testtel() {
	assertTrue(validation.verifTel("+1234"));	
}

@Test
public void testInt() {
	exception.expect(NumberFormatException.class);
	validation.convertInt("200a");
}


@Test
public void testdouble() {
	exception.expect(NumberFormatException.class);
	validation.convertDouble("200.34o");
}

}
