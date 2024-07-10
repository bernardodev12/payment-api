package br.com.app.visa.dto.funding.vaurtauthreplacementdata;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VauRTAuthReplacementDataDto {
    private String replacementCardID;
    private String vauFlag;
    private String replaceDateExpiration;
    private String vauAccntStatus;
    private String vauErrorReasonCode;
}
