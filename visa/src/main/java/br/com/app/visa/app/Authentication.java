package br.com.app.visa.app;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;


import javax.net.ssl.SSLContext;
import java.io.File;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateException;

class Authentication {



    private CloseableHttpClient createHttpClient() throws KeyManagementException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {


        return HttpClients.custom().setSSLSocketFactory(getSSLSocketFactory()).build();

    }

    private SSLConnectionSocketFactory getSSLSocketFactory() throws KeyManagementException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {

        SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(loadSSLContext(),

                new String[]{"TLSv1.2"}, null, SSLConnectionSocketFactory.getDefaultHostnameVerifier());

        return sslSocketFactory;
    }

    private SSLContext loadSSLContext() throws KeyManagementException, UnrecoverableKeyException,

            NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {

        SSLContext sslcontext = SSLContexts.custom()

                .loadKeyMaterial(new File(VisaProperties.getProperty(Property.KEYSTORE_PATH)),

                        VisaProperties.getProperty(Property.KEYSTORE_PASSWORD).toCharArray(),

                        VisaProperties.getProperty(Property.PRIVATE_KEY_PASSWORD).toCharArray())

                .loadTrustMaterial(new File(VisaProperties.getProperty(Property.TRUSTSTORE_PATH)),

                        VisaProperties.getProperty(Property.TRUSTSTORE_PASSWORD).toCharArray())

                .build();

        return sslcontext;
    }
}