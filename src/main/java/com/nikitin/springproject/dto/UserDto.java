package com.nikitin.springproject.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserDto {
    @NotNull
    @NotEmpty
    private String username;

    @NotNull
    @NotEmpty
    private String age;

    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;

    @NotNull
    @NotEmpty
    private String email;


}
