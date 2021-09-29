package com.bank.bankservice.model;

import java.util.Objects;

public class MonthlyStatementRequest {


    private String accountNumber;
    private String month;



    @Override
    public String toString() {
        return "MonthlyStatementRequest{" +
                "accountNumber='" + accountNumber + '\'' +
                ", month='" + month + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonthlyStatementRequest that = (MonthlyStatementRequest) o;
        return Objects.equals(accountNumber, that.accountNumber) && Objects.equals(month, that.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, month);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
