package task1test;

import org.junit.jupiter.api.*;
import task1.CurrencyConverter;

public class CurrencyConverterTest {
	private CurrencyConverter CurCon ;
	
	@BeforeEach
    public void setUp() {
        System.out.println("Setting up Converter instance for each test");
        CurCon = new CurrencyConverter();
    }
	
	@AfterAll
    public static void tearDownAll() {
        System.out.println("Cleaning up CurrencyConverterTest class");
    }
	@Test
	public void convertTest1() {
		System.out.println("USD TO ILS --> Done");
		double result= CurCon.convert(5, "USD", "ILS");
		Assertions.assertEquals(Math.round(18.135), Math.round(result));
	}
	@Test
	public void convertTest2() {
		System.out.println("ILS TO USD --> Done ");
		double result= CurCon.convert(100, "ILS", "USD");
		Assertions.assertEquals(27.57, result);
	}
	@Test
	public void convertTest3() {
		System.out.println("ZEROOO VALUE --> Done");
		double result= CurCon.convert(0, "USD", "ILS");
		Assertions.assertTrue(result==0, "ZEROO Value");
	}
	@Test
	public void convertTest4() {
		System.out.println("USD TO EUR --> Done");
		double result= CurCon.convert(30, "USD", "EUR");
		Assertions.assertEquals(Math.round(27.555), Math.round(result));
	}
	@Test
	public void convertTest5() {
		System.out.println("EUR TO USD --> Done");
		double result= CurCon.convert(27.555, "EUR", "USD");
		Assertions.assertEquals(Math.round(30), Math.round(result));
	}
	@Test
	public void convertTest6() {
		System.out.println("EUR TO ILS --> Done");
		double result= CurCon.convert(50, "EUR", "ILS");
		Assertions.assertEquals(Math.round(197.415), Math.round(result));
	}
	@Test
	public void convertTest7() {
		System.out.println("ILS TO EUR --> Done");
		double result= CurCon.convert(197.415, "ILS", "EUR");
		Assertions.assertEquals(Math.round(50), Math.round(result));
	}
	@Test
	public void convertTest8() {
		System.out.println("Negative VALUE --> Done");
		double result= CurCon.convert(-2.1, "EUR", "USD");
		Assertions.assertTrue(result < 0, "Negative Value"); 

	}
	@Test
	public void convertTest9() { 
		System.out.println("ILS TO ILS --> Done");
		double result= CurCon.convert(150, "ILS", "ILS");
		Assertions.assertEquals(Math.round(150), Math.round(result));
	}
	@Test
	public void convertTest10() { 
		System.out.println("USD TO USD --> Done");
		double result= CurCon.convert(100, "USD", "USD");
		Assertions.assertEquals(Math.round(100), Math.round(result));
	}
	@Test
	public void convertTest11() { 
		System.out.println("EUR TO EUR --> Done");
		double result= CurCon.convert(70, "EUR", "EUR");
		Assertions.assertEquals(Math.round(70), Math.round(result));
	}
	
	

}