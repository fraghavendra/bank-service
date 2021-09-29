package com.bank.bankservice.controller;

import com.bank.bankservice.model.Account;
import com.bank.bankservice.model.AccountTransferRequest;
import com.bank.bankservice.model.MonthlyStatementRequest;
import com.bank.bankservice.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private BankService bankService;



    @GetMapping("/create-account")
    public void createAccount(@RequestBody Account account) {

        bankService.createAccount(account);

    }


    @GetMapping("/transfer")
    public void transfer(@RequestBody AccountTransferRequest accountTransferRequest) {

        bankService.transfer(accountTransferRequest);
    }

    @GetMapping("/monthly-statement")
    public void monthlyStatement(@RequestBody MonthlyStatementRequest monthlyStatementRequest) {
       bankService.generateMonthlyStatement(monthlyStatementRequest);
    }


}
