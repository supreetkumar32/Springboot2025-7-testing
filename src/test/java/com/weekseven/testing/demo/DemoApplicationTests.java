package com.weekseven.testing.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

//@SpringBootTest
@Slf4j
class DemoApplicationTests {

	@BeforeEach
	void setUp(){
		log.info("It will run the method before each test");
	}

	@AfterEach
	void tearDown(){
		log.info("It will run the method after each test");
	}

	@Test
	@Disabled
	void contextLoads() {
	}

	@Test
	@DisplayName("displayTestNameTwo")
	void testNumbetOne() {
		log.info("test one is run");
	}

	@BeforeAll
	static void setUpOnce(){
		log.info("it run at one time in the beginning");
	}

	@AfterAll
	static void tearDownOnce(){
		log.info("it run at one time in the last");
	}

	@Test
	void testNumberTwo() {
		log.info("test two is run");
	}

	@Test
//	@DisplayName("displayTestNameTwo")
	void testDivideTwoNumbers_whenDenominatorIsZero_ThenArithmeticException() {

		int a = 5;
		int b = 0;

		assertThatThrownBy(() -> divideTwoNumbers(a, b))
				.isInstanceOf(ArithmeticException.class)
				.hasMessage("Tried to divide by zero");

	}

	int addTwoNumbers(int a, int b) {
		return a+b;
	}

	double divideTwoNumbers(int a, int b) {
		try {
			return a/b;
		} catch (ArithmeticException e) {
			log.error("Arithmentic excepiton occured: "+e.getLocalizedMessage());
			throw new ArithmeticException("Tried to divide by zero");
		}
	}

}
