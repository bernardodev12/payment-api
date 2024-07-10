package br.com.app.visa.dto.address;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {
    private String country;
    private String zipCode;
    private String county;
    private String state;
}
