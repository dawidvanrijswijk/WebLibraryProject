package repository;

import model.Author;

import java.util.List;

public class AuthorRepository extends GenericRepository<Author, Long> implements IAuthorRepository {

    @Override
    public List<Author> findAll() {
        return null;
    }

    @Override
    public Author find(Long id) {
        return super.read(id);
    }

    @Override
    public void create(Author author) {
        super.create(author);
    }

    @Override
    public Author read(Long id) {
        return super.read(id);
    }

    @Override
    public void update(Author author) {
        super.update(author);
    }

    @Override
    public void delete(Long id) {
        super.deleteById(id);
    }
}
