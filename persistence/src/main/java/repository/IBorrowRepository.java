package repository;

import model.Book;

import java.util.List;

public interface IBorrowRepository {
    List<Book> findAll();

    void delete(Long id);
}
