import model.Book;
import model.BookDTO;
import model.BooksType;
import repository.BookRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookService implements IBookService {

    public BookService() {
    }

    @Override
    public List<BookDTO> findAll() {
        BookRepository bookRepository = new BookRepository();

        List<Book> books = bookRepository.findAll();

        return books.stream()
                .map(b -> {
                    String borrowerName = null;
                    Long borrowId = null;
                    return new BookDTO(b.getId(), b.getTitle(), b.getRelease(), b.getIsbn(), b.getPages(), b.getSummary(), b.getAuthor().getFirstName(),
                            borrowerName, b.getTitle(), b.isBorrow());
                })
                .collect(Collectors.toList());

    }

    @Override
    public List<String> findAllCategories() {
        return Arrays.stream(BooksType.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }
}
