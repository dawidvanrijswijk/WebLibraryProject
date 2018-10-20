package repository;

import java.awt.print.Book;
import java.util.List;

public class BookRepository extends GenericRepository<Book, Long> implements IBookRepository {

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public void create(Book book) {
        super.create(book);
    }

    @Override
    public Book read(Long id) {
        return super.read(id);
    }

    @Override
    public void update(Book book) {
        super.update(book);
    }

    @Override
    public void delete(Long id) {
        super.deleteById(id);
    }
}
