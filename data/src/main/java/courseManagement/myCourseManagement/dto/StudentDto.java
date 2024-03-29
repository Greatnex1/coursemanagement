package courseManagement.myCourseManagement.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class StudentDto {
    @NotEmpty
    private String firstname;

    @NotEmpty
    private String lastname;

    @NotEmpty
    private String email;

//    @NotEmpty
//    private String userName;

    private String gender;

    @NotEmpty
    @Size(message = "password can not be less than 8 character", min = 8)
    private String password;
}
