package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(5,"The Best book", "Börje Börjesson", "1234567891234", "Romance", 7);
		Book book2 = new Book(5,"The Best book", "Börje Börjesson", "1234567891234", "Romance", 7);
		assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(5,"The Best book", "Börje Börjesson", "1234567891234", "Romance", 7);
		Book book2 = new Book(4,"The Second Best book", "Börje Börjesson", "9876543211234", "Crime", 7);
		assertNotEquals(book1, book2);
	}

}
