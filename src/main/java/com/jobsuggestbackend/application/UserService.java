package com.jobsuggestbackend.application;

import com.jobsuggestbackend.DTO.UserRegisterInputDTO;
import com.jobsuggestbackend.application.DataEncrypter.Encryption;
import com.jobsuggestbackend.model.User;
import com.jobsuggestbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private ValidationUtils validationUtils;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Encryption encryption;

    public String register(UserRegisterInputDTO inputDTO) {
        try {
            if (inputDTO == null || validationUtils.areAllFieldsNull(inputDTO)) {
                return "Parameter passing failed";
            }

            User existingUsername = userRepository.getUserByUsername(inputDTO.getUsername());
            if (existingUsername != null) {
                return "Duplicated username";
            }

            User existingEmail = userRepository.getUserByEmail(inputDTO.getEmail());
            if (existingEmail != null) {
                return "Email used.";
            }

            User userInfo = new User(inputDTO.getUsername(), inputDTO.getPassword(), inputDTO.getEmail());
            User save = userRepository.save(userInfo);

            if (save.getId() == null) {
                return "Unexpected Error.";
            }

            return "Save successful.";
        } catch (Exception exception) {
            return exception.getMessage();
        }
    }
}
