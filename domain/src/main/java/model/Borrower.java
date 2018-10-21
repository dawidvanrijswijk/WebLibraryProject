package model;

import javax.persistence.*;

@Entity
@Table(name = "borrower")
public class Borrower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @OneToOne
    @JoinColumn(name = "borrower_details_id")
    private BorrowerDetails borrowerDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BorrowerDetails getBorrowerDetails() {
        return borrowerDetails;
    }

    public void setBorrowerDetails(BorrowerDetails borrowerDetails) {
        this.borrowerDetails = borrowerDetails;
    }
}
