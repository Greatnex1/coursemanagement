package courseManagement.myCourseManagement.dto;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ShiftRight;

@Getter
@Setter
public class CourseDto {
    private  Integer courseId;

    private String courseTitle;

}
