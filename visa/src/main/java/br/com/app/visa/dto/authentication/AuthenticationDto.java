package br.com.app.visa.dto.authentication;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationDto {
    private String KEYSTORE_PATH;
    private String KEYSTORE_PASSWORD;
    private String PRIVATE_KEY_PASSWORD;
    private String TRUSTSTORE_PATH;
    private String TRUSTSTORE_PASSWORD;
    private String KEY_STORE_PASSWORD;
    private String KEY_STORE_PATH;
}
