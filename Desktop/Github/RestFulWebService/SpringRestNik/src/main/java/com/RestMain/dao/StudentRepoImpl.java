package com.RestMain.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.transaction.annotation.Transactional;

import com.RestMain.Domain.Student;



@Transactional
public interface StudentRepoImpl extends JpaRepository<Student, Long> {

}
