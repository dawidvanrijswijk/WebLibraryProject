package repository;

import model.Author;
import model.Book;

import java.util.List;

public interface IAuthorRepository {
    List<Book> findAll();

    Author find(Long id);

    void delete(Long id);
}
