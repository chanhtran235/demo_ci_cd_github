package org.example.demo_spring_data_jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.demo_spring_data_jpa.entity.Classes;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

//    @NotEmpty(message = "Require input data")
//    @Pattern(regexp = "^[A-Z][a-z]*(\\s[A-Z][a-z]+)+$",message = "Not match pattern")
    private String name;
    private boolean gender;
    private Classes classes;
}
