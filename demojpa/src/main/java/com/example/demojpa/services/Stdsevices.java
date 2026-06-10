package com.example.demojpa.services;

import com.example.demojpa.model.Student;
import com.example.demojpa.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class Stdsevices {

    @Autowired
    StudentRepo repo;
    public List<Student> getallstudent(){
        return repo.findAll();
    }

    public void addstudent(Student student) {
        repo.save(student);
    }

    public Student studentbtid(int rollno) {
        return repo.findById(rollno).orElse(new Student());
    }

    public void updatestudent(Student student) {
        repo.save(student);
    }

    public void deletebyid(int rollno) {
        repo.deleteById(rollno);
    }

    public void deleteall() {
        repo.deleteAll();
    }

    public List<Student> findbytechnology(String Technology) {
        return repo.findByTechnology(Technology);
    }

    public List<Student> findbyname(String name) {
        return repo.findByname(name);
    }

    public List<Student> findBygenderandtechnology(String gender, String technology){
        return repo.findBygenderandtechnology(gender,technology);
    }

    /*public void patchupdate(int rollno, Map<String, Value> patch) {

        if(studentbtid(rollno)==null)
        {
            throw new RuntimeException("Employee not found");
        }
       Student std= patch.forEach((key,value)->{
           switch (key){
               case "name" : Student.setName((value);
               break;
               case "name": employee.setName((String) value); break;
                case "email": employee.setEmail((String) value); break;
                case "role": employee.setRole((String) value); break;


           }
       });
    }*/
}
