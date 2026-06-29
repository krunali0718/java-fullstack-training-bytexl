package com.mru.exceptionapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Studentdto {
    
    @NotNull
    @NotBlank
    @Size(min = 3, max = 10, message = "Name must be between 3 and 20 characters")
    String name;

    @Email
    String email;
    long contact;

}
