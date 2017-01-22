package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Dao.Student;

@Transactional
public interface StudentRepoFinal extends JpaRepository<Student, Long>, CrudRepository<Student, Long> {

}
