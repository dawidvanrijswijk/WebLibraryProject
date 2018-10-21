package model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "release_date")
    private LocalDate release;

    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER)
    private Set<Borrow> borrows;

    @Column(name = "borrow")
    private boolean borrow = false;

    @Column(nullable = false, unique = true, length = 13)
    private String isbn;

    @Column(name = "category", nullable = false)
    private BooksType category;

    private String description;

    private Integer pages;

    @Column(name = "summary", nullable = false)
    private String summary;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate relase) {
        this.release = relase;
    }

    public Set<Borrow> getBorrows() {
        return borrows;
    }

    public void setBorrows(Set<Borrow> borrows) {
        this.borrows = borrows;
    }

    public boolean isBorrow() {
        return borrow;
    }

    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BooksType getCategory() {
        return category;
    }

    public void setCategory(BooksType category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}