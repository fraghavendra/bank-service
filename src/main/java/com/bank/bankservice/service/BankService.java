package com.bank.bankservice.service;

import com.bank.bankservice.model.Account;
import com.bank.bankservice.model.AccountTransferRequest;
import com.bank.bankservice.model.MonthlyStatementRequest;
import com.bank.bankservice.repository.AccountRepository;
import com.bank.bankservice.repository.StatementRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BankService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private StatementRepository statementRepository;

    public void createAccount(Account account) {

        accountRepository.save(account);

    }

    public void transfer(AccountTransferRequest accountTransferRequest) {
        debitFromAccount(accountTransferRequest.getFromAccountNumber(), accountTransferRequest.getAmount());
        creditToAccount(accountTransferRequest.getToAccountNumber(), accountTransferRequest.getAmount());

    }


    public boolean debitFromAccount(String fromAccountNumber, String amount) {
        //Imple
        return true;
    }

    public boolean creditToAccount(String toAccountNumber, String amount) {
//Imple
        return true;
    }

    public void generateMonthlyStatement(MonthlyStatementRequest monthlyStatementRequest) {
        statementRepository.findById(monthlyStatementRequest.getMonth());

    }
}
