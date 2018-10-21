package repository;

import model.Book;
import model.Borrower;

import java.util.List;

public class BorrowerRepository extends GenericRepository<Borrower, Long> {

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public void create(Borrower borrower) {
        super.create(borrower);
    }

    @Override
    public Borrower read(Long id) {
        return super.read(id);
    }

    @Override
    public void update(Borrower borrower) {
        super.update(borrower);
    }

    @Override
    public void delete(Long id) {
        deleteById(id);
    }
}
