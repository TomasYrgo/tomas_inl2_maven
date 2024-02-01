package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
		bc.addBook(new Book(5, "Test book", "", "", "", 7));
		assertEquals(2, bc.getNumberOfBooks());
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
		assertSame( book1, bc.findBook("Learning Java"));
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
		assertSame( book1, bc.findBook("LeArNiNg JaVa"));
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
		assertSame( book1, bc.findBook("    Learning Java    "));
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {
		assertThrows(BookNotFoundException.class, ()-> bc.findBook("This book dosn't exist"));
	}

}
