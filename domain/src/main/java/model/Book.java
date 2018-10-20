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

    @Column(name = "relase_date")
    private LocalDate relase;

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

    @Column(name = "last_name", nullable = false)
    private String last_name;

    @Column(name = "birth_place", nullable = false)
    private String birth_place;
}
