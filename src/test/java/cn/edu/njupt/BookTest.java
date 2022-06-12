package cn.edu.njupt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private Book book1, book2;

    @Before
    public void setUp() throws Exception {
        book1 = new Book("ES", 12.99);
        book2 = new Book("The Gate", 11.99);
    }

    @After
    public void tearDown() throws Exception {
        book1 = null;
        book2 = null;
    }

    @Test
    public void testEquals() {
        assertFalse(book2.equals(book1));
        assertTrue(book1.equals(book1));
    }
}