package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
class validateAddressInfo {
	private PlaceOrderController placeOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		" ,false",
		"So nha 200 duong Tran Phu  $ TP Ha Tinh,false",
		"Sonha100duongTranTPHatinh,True",
		"So nha 300 duong Tran Phu TP Ha Tinh,True"
		
	})
	
	@Test
	void testValidateAddress() {
		boolean isValide = placeOrderController.validateAddress("So nha 200, phuong Tran Phu, TP Ha Tinh ")
	}

}
