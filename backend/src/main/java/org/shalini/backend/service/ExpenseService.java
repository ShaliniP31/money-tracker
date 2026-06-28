package org.shalini.backend.service;

import lombok.RequiredArgsConstructor;
import org.shalini.backend.dto.ExpenseDTO;
import org.shalini.backend.entity.Expense;
import org.shalini.backend.mapper.ExpenseMapper;
import org.shalini.backend.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final ExpenseMapper expenseMapper;

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense addExpense(ExpenseDTO expenseDTO) {
        Expense expense = expenseMapper.toExpense(expenseDTO);
        return expenseRepository.save(expense);
    }
}
