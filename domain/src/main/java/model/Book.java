package model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "book")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "relase_date")
    private LocalDate relase;

    private boolean borrow;

    @Column(nullable = false, unique = true, length = 13)
    private String isbn;

    @Column(EnumType.STRING)
    private BooksType category;

    private String description;

    private Integer pages;

    @Column(name = "summary", nullable = false)
    private String summary;

    @Column(name = "last_name", nullable = false)
    private String last_name;

    @Column(name = "birth_place", nullable = false)
    private String birth_place;

    public Book() {
    }
}
