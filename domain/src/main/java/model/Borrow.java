package model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

public class Borrow implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_borrow")
    private Long id;

    @Column(name = "rental_date")
    private LocalDate rentalDate;

    @ManyToMany
    @JoinColumn(name = "book_id")
    private Long book_id;

}
