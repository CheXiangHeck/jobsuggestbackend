package com.jobsuggestbackend.application.DataEncrypter;

import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class Encryption {

    public String EncrypteData(String ID) {
        return Base64.getEncoder().encodeToString(ID.getBytes());
    }

    public String DecrypteData(String encryptedData) {
        return new String(Base64.getDecoder().decode(encryptedData));
    }
}
