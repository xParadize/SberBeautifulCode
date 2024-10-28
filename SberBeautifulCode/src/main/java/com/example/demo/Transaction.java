package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Transaction")
public class Transaction {
    private String id;
    private double amount;
    private String date;
    private String status;
}
