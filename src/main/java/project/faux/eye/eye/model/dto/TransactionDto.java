package project.faux.eye.eye.model.dto;

import lombok.Getter;
import lombok.Setter;
import project.faux.eye.eye.model.Side;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class TransactionDto implements Serializable {
    private String id;
    private String code;
    private double cost;
    private Side side;
    private double share;
    private LocalDate localDate;
}