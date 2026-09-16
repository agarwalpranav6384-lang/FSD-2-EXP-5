package com._BDS2B.StudentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com._BDS2B.StudentManagement.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
