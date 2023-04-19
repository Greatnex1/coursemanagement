package courseManagement.myCourseManagement.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Getter
public class RegistrationRequestDto {

    private String firstName;

    private String lastName;

    private String email;

    private String gender;

    private String password;

    private String username;

    private String phoneNumber;

}
