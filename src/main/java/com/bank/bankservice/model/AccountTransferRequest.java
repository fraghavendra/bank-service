package com.bank.bankservice.model;

import java.util.Objects;

public class AccountTransferRequest {

    private String fromAccountNumber;
    private String toAccountNumber;
    private String amount;


    @Override
    public String toString() {
        return "AccountTransferRequest{" +
                "fromAccountNumber='" + fromAccountNumber + '\'' +
                ", toAccountNumber='" + toAccountNumber + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransferRequest that = (AccountTransferRequest) o;
        return Objects.equals(fromAccountNumber, that.fromAccountNumber) && Objects.equals(toAccountNumber, that.toAccountNumber) && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromAccountNumber, toAccountNumber, amount);
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
