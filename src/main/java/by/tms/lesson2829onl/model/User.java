package by.tms.lesson2829onl.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class User {
    private String username;
    private String password;
    private String email;
}
