package project.faux.eye.eye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.faux.eye.eye.model.dto.TransactionDto;
import project.faux.eye.eye.model.entity.TransactionModel;
import project.faux.eye.eye.service.StockTransactionService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/transactions")
public class StockTransactionController {

    @Autowired
    private StockTransactionService stockTransactionService;

    @PostMapping
    public void createTransaction(@RequestBody TransactionDto dto) {
        stockTransactionService.createTransaction(dto);
    }

    @GetMapping
    public List<TransactionModel> getAll() {
        return stockTransactionService.getAllTransactions();
    }
}