package StudentDetails.demo.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int age;
    private int admNo;
    private String city;


    public Student(String name, int age, int admNo, String city) {
        this.name = name;
        this.age = age;
        this.admNo = admNo;
        this.city = city;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
