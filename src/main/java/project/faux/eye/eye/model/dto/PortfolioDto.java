package project.faux.eye.eye.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortfolioDto {
    private Long id;
    private String portfolioName;
    private String code;
    private double averageCost;
    private double totalShare;
    private double totalPnl;
}
