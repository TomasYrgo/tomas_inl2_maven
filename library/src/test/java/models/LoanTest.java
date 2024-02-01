package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utilities.*;

import java.time.LocalDate;

public class LoanTest {

	//VG
	@Test
	public void testDueDate() {
		Customer customer1 = new Customer("", "", "", "", "", "", 1, GenderType.MALE);
		Book book1 = new Book(1, "", "", "", "", 10);
		Loan loan1 = new Loan(10, customer1, book1);

		assertEquals(LocalDate.now().plusDays(14), loan1.getDueDate());
   }
}