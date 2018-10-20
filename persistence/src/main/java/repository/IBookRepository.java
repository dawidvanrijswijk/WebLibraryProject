package repository;

import java.awt.print.Book;
import java.util.List;

public interface IBookRepository {

    List<Book> findAll();

    void create(Book book);

    Book read(Long id);

    void update(Book book);

    void delete(Long id);
}
