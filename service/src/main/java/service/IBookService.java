package service;

import model.BookDTO;

import java.util.List;

public interface IBookService {
    List<BookDTO> findAll();

    List<String> findAllCategories();
}
