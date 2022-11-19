package com.example.project.services.tests;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;


class UserServiceTests {
	
	@Test
	void test() {
		assertEquals(1, 1);
		// you can mock concrete classes, not only interfaces
		LinkedList mockedList = mock(LinkedList.class);

		// stubbing appears before the actual execution
		when(mockedList.get(0)).thenReturn("first");

		// the following prints "first"
		System.out.println(mockedList.get(0));
	}

}
