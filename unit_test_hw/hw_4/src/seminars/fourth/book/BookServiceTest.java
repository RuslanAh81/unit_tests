package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
public class BookServiceTest {
    private BookService bookService;
    private BookRepository mockBookRepository;

    @BeforeEach
    public void setUp() {
        mockBookRepository = mock(BookRepository.class);
        bookService = new BookService(mockBookRepository);
    }

    @Test
    public void testFindBookById() {
        Book expectedBook = new Book("1", "Book1", "Autor1");
        when(mockBookRepository.findById("1")).thenReturn(expectedBook);
        Book foundBook = bookService.findBookById("1");
        verify(mockBookRepository).findById("1");
        assertEquals(expectedBook,foundBook);
    }

    @Test
    public void testFindAllBooks() {
        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );
        when(mockBookRepository.findAll()).thenReturn(expectedBooks);
        List<Book> allBooks = bookService.findAllBooks();
        verify(mockBookRepository).findAll();
        assertEquals(expectedBooks, allBooks);
    }
}
