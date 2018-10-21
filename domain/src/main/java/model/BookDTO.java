package model;

import java.time.LocalDate;

public class BookDTO {

    private Long id;
    private String title;

    private LocalDate releaseDate;
    private String isbn;

    private int pagesCount;
    private String description;

    private String authorName;

    private String borrowerName;


    private String booksType;
    private boolean borrowed;

    public BookDTO(Long id, String title, LocalDate releaseDate, String isbn, int pagesCount, String description, String authorName, String borrowerName, String booksType, boolean borrowed) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.isbn = isbn;
        this.pagesCount = pagesCount;
        this.description = description;
        this.authorName = authorName;
        this.borrowerName = borrowerName;
        this.booksType = booksType;
        this.borrowed = borrowed;
    }

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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getBooksType() {
        return booksType;
    }

    public void setBooksType(String booksType) {
        this.booksType = booksType;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
