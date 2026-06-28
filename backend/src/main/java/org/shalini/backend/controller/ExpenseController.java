package org.shalini.backend.controller;

import lombok.RequiredArgsConstructor;
import org.shalini.backend.dto.ExpenseDTO;
import org.shalini.backend.entity.Expense;
import org.shalini.backend.service.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/expense")
@RequiredArgsConstructor
public class ExpenseController {
    private final ExpenseService expenseService;

    @GetMapping
    private ResponseEntity<List<Expense>> getAllExpenses() {
        try {
            List<Expense> expenseList = expenseService.getAllExpenses();
            if (expenseList.isEmpty()) {
                return new ResponseEntity<>(expenseList, HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(expenseList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Expense> addExpense(@RequestBody ExpenseDTO expenseDTO) {
        return new ResponseEntity<>(expenseService.addExpense(expenseDTO), HttpStatus.OK);
    }
}
