package StudentDetails.demo.API;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    Map<Integer,Student> db1=new HashMap<>();
    @PostMapping("/addStudent")
    public  String addStudent(@RequestBody Student student)
    {

        if(db1.containsKey(student.getAdmNo()))
        {
            return "Student Details already present";
        }
        int admNo=student.getAdmNo();
        db1.put(admNo, student);
        return "Student add successfully";
    }

    @GetMapping("/StudentDetails")
    public Student studentDetails(@RequestParam("q") int admNo)
    {
        if(db1.containsKey(admNo))
        {
            return db1.get(admNo);

        }
       return null;
    }

    @PutMapping("/updateStudentAge")
    public String updateStudent(@RequestParam("q") int age,@RequestParam("a") int admNo)
    {
        db1.get(admNo).setAge(age);
        return "Student age update successfully";
    }

    @DeleteMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("q") int admNo)
    {
        if(db1.containsKey(admNo))
        {
            db1.remove(admNo);
            return "Student details remove successfully";
        }

        return "Student admNo is uncorrected";
    }
}
