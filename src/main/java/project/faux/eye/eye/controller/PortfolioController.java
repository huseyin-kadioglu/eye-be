package project.faux.eye.eye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.faux.eye.eye.service.PortfolioService;

@RestController
@RequestMapping("/portfolios")
public class PortfolioController {


    @Autowired
    private PortfolioService portfolioService;
}