package courseManagement.myCourseManagement.models.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public record Student(Integer id,

   String firstname,

  String lastname,

    String email,

  String  gender,

 String phoneNumber,

  String password

){

}


//    public <E> Student(int id, String name, List<E> of, LocalDate created_date) {
//    }

