package project.faux.eye.eye.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.faux.eye.eye.dao.StockTransactionRepository;
import project.faux.eye.eye.model.dto.TransactionDto;
import project.faux.eye.eye.model.entity.TransactionModel;

import java.util.List;

@Service
public class StockTransactionService {

    @Autowired
    private StockTransactionRepository stockTransactionRepository;

    @Autowired
    private ModelMapper modelMapper;

    public void createTransaction(TransactionDto dto) {
        TransactionModel entity = modelMapper.map(dto, TransactionModel.class);
        stockTransactionRepository.save(entity);
    }

    public List<TransactionModel> getAllTransactions() {
        return stockTransactionRepository.findAll();
    }
}