package br.com.app.visa.dto.founding;

import br.com.app.visa.dto.founding.address.AddressDto;
import br.com.app.visa.dto.founding.addressverificationdata.AddressVerificationDataDto;
import br.com.app.visa.dto.founding.cardacceptor.CardAcceptorDto;
import br.com.app.visa.dto.founding.colombianationalservicedata.ColombiaNationalServiceDataDto;
import br.com.app.visa.dto.founding.riskAssessmentData.RiskAssessmentDataDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoundTransferDto {

    private String surcharge;
    private String amount;
    private String localTransactionDateTime;
    private String cpsAuthorizationCharacteristicsIndicator;
    private RiskAssessmentDataDto riskAssessmentDataDto;
    private ColombiaNationalServiceDataDto colombiaNationalServiceDataDto;
    private CardAcceptorDto acceptorDto;
    private String acquirerCountryCode;
    private String acquiringBin;
    private String senderCurrencyCode;
    private String retrievalReferenceNumber;
    private AddressVerificationDataDto addressVerificationDataDto;
    private String cavv;
    private String systemsTraceAuditNumber;
    private String businessApplicationId;
    private String senderPrimaryAccountNumber;
    private String settlementServiceIndicator;
    private String visaMerchantIdentifier;
    private String foreignExchangeFeeTransaction;
    private String senderCardExpiryDate;
    private String nationalReimbursementFee;

}
