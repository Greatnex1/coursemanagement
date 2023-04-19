package courseManagement.myCourseManagemnt.user.student;

import courseManagement.myCourseManagement.models.study.Course;
import courseManagement.myCourseManagement.models.user.Student;
import courseManagement.myCourseManagemnt.study.CourseRow;
import courseManagement.myCourseManagemnt.user.student.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDataService implements StudentDao {

    private final JdbcTemplate jdbcTemplate;

    public StudentDataService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
   public List<Course> selectRegisteredCourse() {

        var sql ="""
                SELECT id,courseCode,courseTitle,courseCreated
                FROM coursemanagement.public.course
                LIMIT 100;

                """;

        return jdbcTemplate.query(sql, new CourseRow());

   }

    @Override
    public int insertStudent(Student student) {
String sql = """
           INSERT INTO student(firstname, lastname, email, gender)
           VALUES (?,?,?,?)
              """;
return jdbcTemplate.update(sql,student.firstname(),student.lastname(),student.email(),student.gender());

    }

    @Override
    public int deleteCourse(int id) {
        var sql = """
              DELETE  from coursemanagement.public.course
              where id =   ?
                """;
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public List<Student> registeredStudents() {
        return null;
    }
}