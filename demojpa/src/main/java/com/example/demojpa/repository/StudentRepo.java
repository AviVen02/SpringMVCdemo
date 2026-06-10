package com.example.demojpa.repository;

import com.example.demojpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

   List<Student> findByTechnology(String Technology);

    List<Student> findByname(String name);

    @Query(nativeQuery = true,value = "select * from student where gender =:gender and technology =:technology")
    List<Student> findBygenderandtechnology(@Param("gender") String gender, @Param("technology") String technology);
}
