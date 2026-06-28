package org.shalini.backend.mapper;

import org.mapstruct.Mapper;
import org.shalini.backend.dto.ExpenseDTO;
import org.shalini.backend.entity.Expense;

@Mapper(componentModel = "spring")
public interface ExpenseMapper {

    Expense toExpense(ExpenseDTO expenseDTO);

    ExpenseDTO toExpenseDTO(Expense expense);
}
