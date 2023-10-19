package project.faux.eye.eye.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.faux.eye.eye.model.entity.Portfolio;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, String> {
    Portfolio findByCode(String code);
}