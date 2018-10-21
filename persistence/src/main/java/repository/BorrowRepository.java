package repository;

import model.Book;
import model.Borrow;

import java.util.List;

public class BorrowRepository extends GenericRepository<Borrow, Long> implements IBorrowRepository {

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public void create(Borrow borrow) {
        super.create(borrow);
    }

    @Override
    public Borrow read(Long id) {
        return super.read(id);
    }

    @Override
    public void update(Borrow borrow) {
        super.update(borrow);
    }

    @Override
    public void delete(Long id) {
        deleteById(id);
    }
}