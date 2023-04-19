package courseManagement.myCourseManagemnt.study;

import courseManagement.myCourseManagement.models.study.Course;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class CourseRow implements RowMapper<Course> {


    @Override
    public Course mapRow(ResultSet rs, int rowNum) throws SQLException {

        return new Course(

                rs.getInt("id"),
                rs.getString("name"),
                List.of(),
                LocalDate.parse(rs.getString("created_date"))
        );
    }
}
