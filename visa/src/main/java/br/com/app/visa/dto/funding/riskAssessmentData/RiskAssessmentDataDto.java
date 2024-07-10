package br.com.app.visa.dto.riskAssessmentData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RiskAssessmentDataDto {
    private boolean traExemptionIndicator;
    private boolean trustedMerchantExemptionIndicator;
    private boolean scpExemptionIndicator;
    private boolean delegatedAuthenticationIndicator;
    private boolean lowValueExemptionIndicator;
}
