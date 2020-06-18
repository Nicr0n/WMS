package com.nicron.study.wmsapi.DTO;

import com.nicron.study.wmsapi.entity.User;
import com.nicron.study.wmsapi.entity.UserInformation;
import lombok.Data;

@Data
public class RegistrationDTO {
    private User user;
    private UserInformation userInformation;
}
