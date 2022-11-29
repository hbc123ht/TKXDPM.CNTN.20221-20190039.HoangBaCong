package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class validateNameTest {
	private PlaceOrderController placeOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	@ParameterizedTest
	@CsvSource({
		"1HoangBaCong, false",
		"@HoangCong Blabl, false",
		" , false",
		"Cong HoangBa, false",
		"HoangBaCong, false"
	})
	
	@Test
	void test() {
		boolean isValided = placeOrderController.validateName("HoangBaCong");
		assertEquals(true, isValided);
		
	}

}
