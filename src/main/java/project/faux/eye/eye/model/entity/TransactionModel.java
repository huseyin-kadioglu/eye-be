package project.faux.eye.eye.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import project.faux.eye.eye.model.Side;


@Getter
@Setter
@Entity
public class TransactionModel {

    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private double cost;
    private Side side;
    private double share;
}