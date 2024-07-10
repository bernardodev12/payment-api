package br.com.app.visa.app.controller;

import br.com.app.visa.app.service.SendFunding;
import br.com.app.visa.dto.funding.FundTransferDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/")
public class Funding {

    @Autowired
    private SendFunding sendFunding;

    @PostMapping(value = "visa/send-payment")
    public ResponseEntity<String> createRequest(@RequestBody FundTransferDto fundTransferDto) throws JsonProcessingException {
        return  ResponseEntity.ok(sendFunding.sendFunding(fundTransferDto));
    }
}
