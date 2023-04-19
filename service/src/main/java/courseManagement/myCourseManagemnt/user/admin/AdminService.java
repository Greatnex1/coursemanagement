package courseManagement.myCourseManagemnt.user.admin;

import courseManagement.myCourseManagement.dto.RegistrationRequestDto;
import courseManagement.myCourseManagement.models.user.Admin;

public interface AdminService {

    Admin signUp(RegistrationRequestDto registrationRequestDto);


    void removeStudent(Long studentId);

}
