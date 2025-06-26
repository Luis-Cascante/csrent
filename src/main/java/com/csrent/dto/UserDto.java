package com.csrent.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserDto {
    private String name;
    @Email(message = "correo no cumple la estructura")
    @NotBlank(message = "correo no puede quedar en blanco")
    private String email;
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\\\d)(?=.*[!@#$%^&*()]).{8,}$",
    message = "La contraseña debe cumplir con los requisitos solicitados")
    private String password;
    private String rol;
}
