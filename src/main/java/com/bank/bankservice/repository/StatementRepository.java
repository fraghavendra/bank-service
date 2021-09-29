package com.bank.bankservice.repository;

import com.bank.bankservice.model.Statement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface StatementRepository extends JpaRepository<Statement, String> {




}
