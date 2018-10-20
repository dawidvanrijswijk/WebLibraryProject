package repository;

import model.Borrow;

import java.util.List;

public interface IBorrowRepository {
    List<Borrow> findAll();

    void delete(Long id);
}
