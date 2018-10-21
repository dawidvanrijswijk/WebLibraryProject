package model;

import javax.persistence.*;

@Entity
@Table(name = "borrower_details")
public class BorrowerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_borrower_details")
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

}
