package repository;

import model.Author;

import java.util.List;

public interface IAuthorRepository {
    List<Author> findAll();

    Author find(Long id);

    void delete(Long id);
}
