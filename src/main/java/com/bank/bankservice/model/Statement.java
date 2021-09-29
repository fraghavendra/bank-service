package com.bank.bankservice.model;

import java.time.LocalDate;
import java.util.Objects;

public class Statement {


    private LocalDate date;
    private String fromAccountNumber;
    private String amount;
    private String finalBalance;


    @Override
    public String toString() {
        return "Statement{" +
                "date=" + date +
                ", fromAccountNumber='" + fromAccountNumber + '\'' +
                ", amount='" + amount + '\'' +
                ", finalBalance='" + finalBalance + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statement statement = (Statement) o;
        return Objects.equals(date, statement.date) && Objects.equals(fromAccountNumber, statement.fromAccountNumber) && Objects.equals(amount, statement.amount) && Objects.equals(finalBalance, statement.finalBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, fromAccountNumber, amount, finalBalance);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFinalBalance() {
        return finalBalance;
    }

    public void setFinalBalance(String finalBalance) {
        this.finalBalance = finalBalance;
    }
}
