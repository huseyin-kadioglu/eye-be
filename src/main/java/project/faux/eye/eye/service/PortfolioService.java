package project.faux.eye.eye.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.faux.eye.eye.dao.PortfolioRepository;
import project.faux.eye.eye.model.dto.TransactionDto;
import project.faux.eye.eye.model.entity.Portfolio;

import java.util.List;


@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<Portfolio> getAllPortfolio() {
        return portfolioRepository.findAll();
    }

    public Portfolio findByCode(String code) {
        return portfolioRepository.findByCode(code);
    }

    public void createPortfolio(TransactionDto dto) {
        Portfolio entity = new Portfolio();
        entity.setPortfolioName("1");
        entity.setCode(dto.getCode());
        entity.setTotalShare(dto.getShare());
        entity.setAverageCost(dto.getCost());
        portfolioRepository.save(entity);
    }

    public void updatePortfolio(TransactionDto dto) {
        Portfolio record = portfolioRepository.findByCode(dto.getCode());
        double avgCost = record.getAverageCost();
        double totalShare = record.getTotalShare() + dto.getShare();
        double calculatedAvgCost = ((avgCost * record.getTotalShare()) + (dto.getShare() * dto.getCost())) / totalShare;
        record.setAverageCost(calculatedAvgCost);
        record.setTotalShare(totalShare);
        portfolioRepository.save(record);
    }
}