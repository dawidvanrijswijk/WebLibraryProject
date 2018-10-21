package repository;

import model.Book;

import java.util.List;

public class BookRepository extends GenericRepository<Book, Long> implements IBookRepository {

    @Override
    public List<Book> findAll() {
        return em.createQuery("select b from Book b", Book.class).getResultList();
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
