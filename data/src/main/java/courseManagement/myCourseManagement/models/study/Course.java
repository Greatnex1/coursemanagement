package courseManagement.myCourseManagement.models.study;

import courseManagement.myCourseManagement.models.user.Student;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Course {
    private Integer Id;

    private String courseCode;

    List <Student>   studentsOfferingCourse;

    private   String courseTitle;

    LocalDate dateCourseCreated;

    public Course(int id, String name, List<Object> of, LocalDate created_date) {
    }
}
