package project.faux.eye.eye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.faux.eye.eye.model.Side;
import project.faux.eye.eye.model.dto.TransactionDto;
import project.faux.eye.eye.service.StockTransactionService;

import java.util.ArrayList;
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
    public List<TransactionDto> getAll() {
        TransactionDto dto = new TransactionDto();
        dto.setId("1");
        dto.setCode("EREGL");
        dto.setSide(Side.BUY);
        dto.setShare(10);
        dto.setCost(10.2);

        TransactionDto dto2 = new TransactionDto();
        dto2.setId("2");
        dto2.setCode("TUPRS");
        dto2.setSide(Side.BUY);
        dto2.setShare(20);
        dto2.setCost(23.44);


        List<TransactionDto> response = new ArrayList<>();
        response.add(dto);
        response.add(dto2);
        return response;
        //return stockTransactionService.getAllTransactions();
    }
}