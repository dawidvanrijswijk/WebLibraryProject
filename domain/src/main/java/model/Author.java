package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "author")
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "birth_place")
    private String birthPlace;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    @OneToMany(mappedBy = "author")
    private List<Borrow> borrows;
}
