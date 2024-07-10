package br.com.app.visa.dto.funding;

import br.com.app.visa.dto.funding.pointofservicedata.PointOfServiceDataDto;
import br.com.app.visa.dto.funding.serviceprocessingtype.ServiceProcessingTypeDto;

import br.com.app.visa.dto.funding.tokendata.TokenDataDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReturnFundTransactionDto {
    private String approvalCode;
    private Long last4ofPAN;
    private String cavvResultCode;
    private PointOfServiceDataDto pointOfServiceData;
    private String originalActionCode;
    private Long transactionIdentifier;
    private ServiceProcessingTypeDto serviceProcessingType;
    private String responseCode;
    private String transmissionDateTime;
    private String senderIdentificationNumberIndividual;
    private String customerReference;
    private String statusIdentifier;
    private Long networkId;
    private String actionCode;
    private String memberComments;
    private String merchantVerificationValue;
    private Long amount;
    private TokenDataDto tokenData;
    private String additionalTokenRespInfo;
    private String feeProgramIndicator;
    private String reimbursementAttribute;
}
