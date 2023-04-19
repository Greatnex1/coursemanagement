package courseManagement.myCourseManagement.models.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Admin {


    private Integer Id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String phoneNumber;
}
