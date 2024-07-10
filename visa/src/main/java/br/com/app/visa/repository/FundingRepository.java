package br.com.app.visa.repository;

import br.com.app.visa.entity.FundingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface FundingRepository extends JpaRepository<FundingEntity, BigDecimal> {
}
