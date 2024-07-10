package br.com.app.visa.app.service;

import br.com.app.visa.dto.funding.FundTransferDto;
import br.com.app.visa.dto.funding.ReturnFundTransactionDto;
import br.com.app.visa.repository.FundingRepository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


@Service
public class SendFunding {
    private ObjectMapper mapper;
    final static Logger logger = Logger.getLogger(SendFunding.class);

    @Autowired
    private FundingRepository fundingRepository;

    public SendFunding(FundingRepository fundingRepository) {
        this.fundingRepository = fundingRepository;
        this.mapper = new ObjectMapper();
    }

    public String sendFunding(FundTransferDto fundTransferDto) throws JsonProcessingException {
        ReturnFundTransactionDto returnFundTransactionDto = new ReturnFundTransactionDto();
        try{
            URL url = new URL(String.format("URL_VISA_SEND"));
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; utf-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setRequestProperty("auth", "GET_AUTH_CODE"); //GET AUTH CODE FROM Authentication
            httpURLConnection.setDoOutput(true);

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonInputString = objectMapper.writeValueAsString(fundTransferDto);

            try (OutputStream os = httpURLConnection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = httpURLConnection.getResponseCode();

            String responseBody = "";
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println("Reponse body: " + response.toString());
                responseBody = response.toString();
            }else {
                System.out.println("Response Code: " + responseCode);
                responseBody = "{\"messagem\":\'Could not send funding\", \"code\":\""+responseCode+"\"}";
            }

            return responseBody;

        }catch (Exception e){
            logger.error(e.getMessage());
        }
        return mapper.writeValueAsString(returnFundTransactionDto);
    }


}
