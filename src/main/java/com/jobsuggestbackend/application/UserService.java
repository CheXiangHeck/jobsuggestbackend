package com.jobsuggestbackend.application;

import com.jobsuggestbackend.DTO.UserLoginDTO;
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

            String encryptedPassword = encryption.EncrypteData(inputDTO.getPassword());

            User userInfo = new User(inputDTO.getUsername(), encryptedPassword, inputDTO.getEmail());
            User save = userRepository.save(userInfo);

            if (save.getId() == null) {
                return "Unexpected Error.";
            }

            return "Save successful.";
        } catch (Exception exception) {
            return exception.getMessage();
        }
    }

    public String login(UserLoginDTO logininputDTO){
        try{
            if (logininputDTO == null || validationUtils.areAllFieldsNull(logininputDTO)){
                return "login parameter passing failed";
            }

            String encryptPassword = encryption.EncrypteData(logininputDTO.getPassword());
            User verifyUsernamePassword = userRepository.getUserByUsernameAndPassword(logininputDTO.getUsername(),encryptPassword);
            if (verifyUsernamePassword == null){
                return "invalid username and password";
            }

            return "Success To Login";


        } catch (Exception exception){
            return exception.getMessage();
        }
    }


}
