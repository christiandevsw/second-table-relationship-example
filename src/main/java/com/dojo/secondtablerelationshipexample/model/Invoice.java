package com.dojo.secondtablerelationshipexample.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "invoices")
@Data
@NoArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String observation;
    @Column(name = "create_at")
    private Date createAt;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
