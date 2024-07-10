package br.com.app.visa.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "communication")
public class FundingEntity {

    private static final long serialVersionUID = 1L;

    @Id
    private BigDecimal requestCallerId;
    private BigDecimal entityCode;
    private BigDecimal brandCode;
    private BigDecimal partnerCode;
    private String paymentType;
    private BigDecimal requestDate;
    private BigDecimal requestTime;
    private String currency;
    private BigDecimal amount;
    private BigDecimal mcc;
    private String externalTransactionId;

    @Column(name = "data_request_json", columnDefinition = "LONGTEXT")
    private String dataRequestJson;
    @Column(name = "data_response_json", columnDefinition = "LONGTEXT")
    private String dataResponseJson;
    private BigDecimal status;
    private BigDecimal transactionType;
}
