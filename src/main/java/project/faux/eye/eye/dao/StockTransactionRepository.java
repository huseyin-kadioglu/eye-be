package project.faux.eye.eye.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.faux.eye.eye.model.entity.TransactionModel;

@Repository
public interface StockTransactionRepository extends JpaRepository<TransactionModel, String> {
}