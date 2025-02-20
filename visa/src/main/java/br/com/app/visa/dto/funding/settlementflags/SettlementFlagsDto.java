package br.com.app.visa.dto.funding.settlementflags;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SettlementFlagsDto {
    private String settlementServiceFlag;
    private String givUpdatedFlag;
    private String settlementResponsibilityFlag;
    private String givPreviouslyUpdatedFlag;
}
