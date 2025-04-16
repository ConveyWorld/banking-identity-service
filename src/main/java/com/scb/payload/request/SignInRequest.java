package com.scb.payload.request;

import com.scb.annotation.Password;
import com.scb.annotation.UserName;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignInRequest {
    @NotBlank(message = "userName must be not blank")
    @UserName
    String username;

    @Password
    @NotBlank(message = "password must be not blank")
    String password;

  /*  @NotBlank(message = "device must be not blank")
    String deviceInfo;*/
}

