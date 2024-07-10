package br.com.app.visa.dto.cardacceptor;

import br.com.app.visa.dto.address.AddressDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardAcceptorDto {
    private AddressDto address;
    private String idCode;
    private String name;
    private String terminalId;
}
