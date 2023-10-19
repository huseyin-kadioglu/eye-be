package project.faux.eye.eye.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private Long id;
    private String portfolioName;
    private String code;
    private double averageCost;
    private double totalShare;
    private double totalPnl;
}
