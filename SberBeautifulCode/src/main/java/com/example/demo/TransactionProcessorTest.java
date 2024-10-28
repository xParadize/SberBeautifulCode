
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class TransactionProcessorTest {

    @Autowired
    private TransactionProcessor processor;

    @Test
    public void testProcessTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("1", 5000, "2023-01-01", "PENDING"));
        transactions.add(new Transaction("2", 15000, "2023-01-02", "PENDING"));
        transactions.add(new Transaction("3", 2000, "2023-01-03", "COMPLETED"));

        processor.processTransactions(transactions);

        for (Transaction transaction : transactions) {
            System.out.println("Transaction ID: " + transaction.getId() + " Status: " + transaction.getStatus());
        }
    }
}
