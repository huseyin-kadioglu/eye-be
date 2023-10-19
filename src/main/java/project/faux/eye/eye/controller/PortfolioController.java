package project.faux.eye.eye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.faux.eye.eye.model.entity.Portfolio;
import project.faux.eye.eye.service.PortfolioService;

import java.util.List;

@RestController
@RequestMapping("/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    public List<Portfolio> getAll() {
        return portfolioService.getAllPortfolio();
    }
}