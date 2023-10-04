package project.faux.eye.eye.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.faux.eye.eye.dao.StockTransactionRepository;
import project.faux.eye.eye.model.dto.TransactionDto;

import java.util.List;

@Service
public class StockTransactionService {

    @Autowired
    private StockTransactionRepository stockTransactionRepository;

    public void createTransaction(TransactionDto dto) {
        stockTransactionRepository.create(dto);
    }

    public List<TransactionDto> getAllTransactions() {
        return stockTransactionRepository.getAllTransactions();
    }
}