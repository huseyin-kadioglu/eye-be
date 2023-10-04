package project.faux.eye.eye.model.entity;

import lombok.Getter;
import lombok.Setter;
import project.faux.eye.eye.model.Side;


@Getter
@Setter
public class TransactionModel {

    private String code;
    private Side side;
    private String share;
}